package com.qust.mapper;

import com.qust.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    Teacher queryByteaName(String teaName);

    int updateByTeaId(Teacher teacher);

    List<Student> queryStu();
    //成绩查询
    List<Score> queryScore(int teaId);
    //周报查询
    List<Weekly> queryWeekly(int classId);
    //学生请假查询
    List<Leaves> queryLeave(int classid);
    //讲师个人请假查询
    List<Leaves> queryPersonLeave(int teaId);
    //讲师申请请假
     int insertLeave(Leaves leaves);
}
