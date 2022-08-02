package com.example.controller;

import com.example.exception.BusinessException;
import com.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        // 记录日志
        // 发送消息给运维
        // 发送消息给开发人员
        System.out.println("有异常！");
        return new Result(e.getCode(),null, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        System.out.println("有异常！");
        return new Result(e.getCode(),null, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("有异常！");
        return new Result(Code.SYSTEM_UNKOWN_ERROR,null,"系统繁忙，请稍后再试");
    }
}
