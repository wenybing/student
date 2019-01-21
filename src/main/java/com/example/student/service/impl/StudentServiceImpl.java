package com.example.student.service.impl;

import com.example.student.bean.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/1/21 14:25
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentService studentService;

    @Override
    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    @Override
    public void deleteStudent(Integer id) {

    }

    @Override
    public void updateStudent(Student student) {

    }

    @Override
    public Student getStudent(Integer id) {
        return null;
    }

    @Override
    public List<Student> getStudentList() {
        return null;
    }
}
