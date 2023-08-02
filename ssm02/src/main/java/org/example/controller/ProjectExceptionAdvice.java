package org.example.controller;

import org.example.exception.BusinessException;
import org.example.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        return new Result(e.getCode(),null,e.getMessage());
    }
    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e) {
        return new Result(e.getCode(),null,e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public  Result doException(Exception e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发人员
        System.out.println("异常");
        return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙，请稍后再试!!!");
    }
}
