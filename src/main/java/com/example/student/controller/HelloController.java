package com.example.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author wenyabing
 * @Date 2019/1/21 17:03
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }
}
