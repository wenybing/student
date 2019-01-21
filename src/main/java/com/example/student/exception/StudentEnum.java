package com.example.student.exception;

/**
 * @Author wenyabing
 * @Date 2019/1/21 21:47
 */
public enum StudentEnum {
    ADD_ERROR(100, "添加学生信息异常!"),
    DELETE_ERROR(200, "删除学生信息异常!"),
    UPDATE_ERRO(300, "修改学生信息异常!"),
    SEARCH_ERROR(400, "查询学生信息异常!");

    StudentEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
