package com.example.student.handle;

/**
 * @Author wenyabing
 * @Date 2019/1/21 22:27
 */

import com.example.student.bean.Result;
import com.example.student.exception.StudentException;
import com.example.student.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 异常处理类
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result HabdleException(Exception e) {
        if (e instanceof StudentException) {
            StudentException studentException = (StudentException) e;
            return ResultUtil.fail(studentException.getCode(), studentException.getMessage());
        } else {
            return ResultUtil.fail(-1, e.getMessage());
        }

    }
}
