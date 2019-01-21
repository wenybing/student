package com.example.student.service.impl;

import com.example.student.bean.Student;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author wenyabing
 * @Date 2019/1/21 15:53
 */
public class StudentServiceImplTest {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @Test
    public void addStudent() {
        Student student = new Student();
        student.setName("杜甫");
        student.setAge(33);
        studentServiceImpl.addStudent(student);
    }

    @Test
    public void deleteStudent() {
    }

    @Test
    public void updateStudent() {
    }

    @Test
    public void getStudent() {
    }

    @Test
    public void getStudentList() {
    }
}