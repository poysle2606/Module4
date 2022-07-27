package com.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Aspect
public class BookAspect {

    @Pointcut("execution(* com.example.controller.BookController.book*(..))")
    public void allMethod(){}

    @After("allMethod()")
    public void afterCallMethod(){
        System.err.println("Sách đã bị thay đổi" + LocalDateTime.now());
    }
}
