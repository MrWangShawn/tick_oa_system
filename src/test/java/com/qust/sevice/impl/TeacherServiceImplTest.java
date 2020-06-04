package com.qust.sevice.impl;

import com.qust.entity.Student;
import com.qust.mapper.TeacherMapper;
import com.qust.sevice.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeacherServiceImplTest {

   // @Autowired
   //private TeacherService teacherService;
    @Autowired
    private TeacherMapper teacherMapper;


    @Test
    void queryStu() {
        List<Student> students = teacherMapper.queryStu();
        for (Student student : students) {
            System.out.println(student);
        }

    }
}