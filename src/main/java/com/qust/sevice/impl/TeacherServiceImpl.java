package com.qust.sevice.impl;

import com.qust.entity.*;
import com.qust.mapper.TeacherMapper;
import com.qust.sevice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public Teacher queryByteaName(String teaName) {
        return null;
    }

    @Override
    public int updateByTeaId(Teacher teacher) {
        return teacherMapper.updateByTeaId(teacher);
    }

    @Override
    public List<Student> queryStu() {
        return teacherMapper.queryStu();
    }

    @Override
    public List<Score> queryScore(int teaId) {
        return teacherMapper.queryScore(teaId);
    }

    @Override
    public List<Weekly> queryWeekly(int classId) {
        return teacherMapper.queryWeekly(classId);
    }

    @Override
    public List<Leaves> queryLeave(int classid) {
        return teacherMapper.queryLeave(classid);
    }

    @Override
    public List<Leaves> queryPersonLeave(int teaId) {
        return teacherMapper.queryPersonLeave(teaId);
    }

    @Override
    public int insertLeave(Leaves leaves) {
        return teacherMapper.insertLeave(leaves);
    }
}
