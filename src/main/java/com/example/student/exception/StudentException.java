package com.example.student.exception;

/**
 * @Author wenyabing
 * @Date 2019/1/21 21:43
 */

/**
 * 自定义学生异常类
 */
public class StudentException extends RuntimeException {
    private static final long serialVersionUID = 6927334332951469531L;
    private Integer code;

    public StudentException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
