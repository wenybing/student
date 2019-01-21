package com.example.student.controller;

import com.example.student.bean.Result;
import com.example.student.bean.Student;
import com.example.student.exception.StudentEnum;
import com.example.student.exception.StudentException;
import com.example.student.service.StudentService;
import com.example.student.util.ResultUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/1/21 16:59
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    /**
     * 添加学生信息
     *
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/add")
    public Result addStudent(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        studentService.addStudent(student);
        return ResultUtil.success();
    }

    /**
     * 根据id获取学生信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/get/{id}")
    public Result getStudent(@PathVariable("id") Integer id) {
        Student student = studentService.getStudent(id);
        return ResultUtil.success(student);
    }

    /**
     * 获取学生列表
     *
     * @return
     */
    @GetMapping(value = "/list")
    public Result getStudentList() {
        List<Student> studentList = studentService.getStudentList();
        return ResultUtil.success(studentList);
    }

    /**
     * 修改学生信息
     *
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/update")
    public Result updateStudent(@RequestParam("id") Integer id, @RequestParam("name") String name,
                                @RequestParam("age") Integer age) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        studentService.updateStudent(student);
        return ResultUtil.success();
    }

    /**
     * 删除学生信息
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/delete")
    public Result deleteStudent(@RequestParam("id") Integer id) {
        try {
            studentService.deleteStudent(id);
        } catch (Exception e) {
            if (e instanceof StudentException) {
                return ResultUtil.fail(StudentEnum.DELETE_ERROR.getCode(), StudentEnum.DELETE_ERROR.getMessage());
            }
            return ResultUtil.fail(-1, e.getMessage());
        }
        return ResultUtil.success();
    }
}
