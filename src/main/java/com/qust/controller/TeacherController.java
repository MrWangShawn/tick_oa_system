package com.qust.controller;

import com.qust.entity.*;
import com.qust.sevice.TeacherService;
import com.qust.util.FileUtils;
import com.qust.util.MD5Utils;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/toUpdate")
    public String toUpdate() {
        return "teaUpdate";
    }

    //修改个人信息
    @RequestMapping("/updateByTeaId")
    public String updateByTeaId(MultipartFile image, Teacher teacher) {
        //随机生成文件名
        String name = UUID.randomUUID().toString();
        //获取上传路径
        String uploadPath = TeacherController.class.getResource("/").getPath() + "static/teacherImages/" + name;

        System.out.println("上传路径:" + uploadPath);
        //图片上传
        try (
                //准备io流
                InputStream inputStream = image.getInputStream();
                OutputStream outputStream = new FileOutputStream(uploadPath);

        ) {
            IOUtils.copy(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //将图片路径传入数据库
        teacher.setTeaImage("http://localhost:8080/teacherImages/" + name);
        //密码加密
        String teaPassword = teacher.getTeaPassword();
        String s = MD5Utils.md5(teaPassword);
        teacher.setTeaPassword(s);
        teacherService.updateByTeaId(teacher);
        return "index";
    }

    //查询学生列表
    @RequestMapping("/queryStu")
    public String queryStu(Model model) {
        List<Student> studentList = teacherService.queryStu();
        model.addAttribute("stuList", studentList);
        return "teaQueryStu";
    }

    //查询成绩
    @RequestMapping("/queryScore")
    public String queryScore(int teaId, Model model) {
        List<Score> scoreList = teacherService.queryScore(teaId);
        model.addAttribute("scoreList", scoreList);
        return "teaQueryScore";
    }

    //查询周报
    @RequestMapping("/queryWeekly")
    public String queryWeekly(int classId, Model model) {
        List<Weekly> weeklyList = teacherService.queryWeekly(classId);
        model.addAttribute("weeklys", weeklyList);
        return "teaQueryWeekly";
    }

    //查询学生请假
    @RequestMapping("/queryLeave")
    public String queryLeave(int classId, Model model) {
        List<Leaves> leavesList = teacherService.queryLeave(classId);
        model.addAttribute("leaves", leavesList);
        System.out.println(leavesList);
        return "teaQueryLeave";
    }

    //讲师查询个人请假信息
    @RequestMapping("queryPersonLeave")
    public String queryPersonLeave(Integer teaId, Model model) {
        List<Leaves> leavesList = teacherService.queryPersonLeave(teaId);
        model.addAttribute("teaLeave",leavesList);

        return "teaPersonLeave";
    }
    //讲师提交请假
    @RequestMapping("/insertLeave")
    public String insertLeave(@RequestParam("leaveReason") String leaveReason,@RequestParam("teaId") Integer teaId){
        Date date = new Date();
        SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
        String leaveTime = format.format(date);
        Leaves leaves = new Leaves().setLeaveReason(leaveReason).setLeaveTime(leaveTime).setTeaId(teaId).setLeaveTab(1);
          teacherService.insertLeave(leaves);
        return "redirect:queryPersonLeave?teaId="+teaId;
    }
}
