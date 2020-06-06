package com.qust.sevice;

import com.qust.entity.*;

import java.util.List;

public interface TeacherService {

    Teacher queryByteaName(String teaName);

    int updateByTeaId(Teacher teacher);

    List<Student> queryStu();
    List<Score> queryScore(int teaId);
    List<Weekly> queryWeekly(int classId);


    List<Leaves> queryLeave(int classId);
    List<Leaves> queryPersonLeave(int TeaId);
    int insertLeave(Leaves leaves);
}
