package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class ProjectAdvice {
    @Pointcut("execution(* com.example.service.*Service.*(..))")
    private void servicePt(){}

//    @Around("servicePt()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        System.out.println("Test method: " + signature.getDeclaringType() + "." + signature.getName());
        long curr = System.currentTimeMillis();
        Object o = null;
        for (int i = 0; i < 10000; i++) {
            o = pjp.proceed();
        }
        long now = System.currentTimeMillis();
        System.out.println("万次执行时间：" + (now - curr) + " ms");
        return o;
    }

//    @Before("servicePt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println("AOP BEFORE!");
        System.out.println("args:" + Arrays.toString(args));
    }


//    方法参数中JoinPoint可不写，如需要的话必须写在Object ret前面
//    @AfterReturning(value = "servicePt()", returning = "ret")
    public void around(JoinPoint jp, Object ret){
        System.out.println("Result:" + ret);
    }

//    @AfterThrowing(value = "servicePt()", throwing = "t")
    public void afterThrowing(Throwable t){
        System.out.println("AOP AFTERTHROWING");
        System.out.println("Throwable t:" + t);
    }
}
