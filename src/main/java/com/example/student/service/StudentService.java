package com.example.student.service;

import com.example.student.bean.Student;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/1/21 14:18
 */
public interface StudentService {
    /**
     * 添加学生信息
     */
    void addStudent(Student student);

    /**
     * 删除学生信息
     */
    void deleteStudent(Integer id);

    /**
     * 修改学生信息
     */
    void updateStudent(Student student);

    /**
     * 根据id查询学生信息
     */
    Student getStudent(Integer id);

    /**
     * 查询学生信息列表
     */
    List<Student> getStudentList();
}
