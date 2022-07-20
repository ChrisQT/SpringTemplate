package com.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.example.dao.*Dao.*(..))")
    private void pt(){}

    @Pointcut("execution(* com.example.dao.*Dao.select(..))")
    private void pt2(){}

    @Before("pt()")
    public void method(){
        System.out.println("AOP BEFORE!");
    }

    @After("pt2()")
    public void func(){
        System.out.println("AOP AFTER!");
    }

    @Around("pt2()")
    public Object fn(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("AOP AROUND BEFORE");
        Integer proceed = (Integer) pjp.proceed();
        System.out.println("AOP AROUND AFTER");
        return proceed;
    }

    @AfterReturning("pt2()")
    public void f(){
        System.out.println("AOP AFTERRETURNING!");
    }

    @AfterThrowing("pt2()")
    public void afterThrowing(){
        System.out.println("AOP AFTERTHROWING!");
    }


}
