package com.example.student.bean;

/**
 * @Author wenyabing
 * @Date 2019/1/21 17:12
 */

import lombok.Data;

/**
 * 返回结果集
 */
@Data
public class Result<T> {
    /**
     * 错误码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;
}
