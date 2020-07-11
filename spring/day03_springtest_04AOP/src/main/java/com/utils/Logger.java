package com.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution(* *..*.*(..))")
    public void pt1(){

    }

//    @Before("pt1()")
//    public void beforePrintlog(){
//        System.out.println("Logger类中的beforeprintlog方法开始记录日志了");
//    }
//    @After("pt1()")
//    public void afterPrintlog(){
//        System.out.println("Logger类中的afterprintlog方法开始记录日志了");
//    }
//    @AfterThrowing("pt1()")
//    public void afterThrowingPrintlog(){
//        System.out.println("Logger类中的afterThrowingprintlog方法开始记录日志了");
//    }
//    @AfterReturning("pt1()")
//    public void afterReturningPrintlog(){
//        System.out.println("Logger类中的afterReturningprintlog方法开始记录日志了");
//    }
   @Around("pt1()")
    public Object aroundPrintlog(ProceedingJoinPoint pjp){
        Object rtValue=null;
        try{
            System.out.println("Logger类中的aroundPrintlog()方法开始记录日志了 前置");
            Object[] args=pjp.getArgs();

            rtValue=pjp.proceed(args);

            System.out.println("Logger类中的aroundPrintlog()方法开始记录日志了 后置");

            return rtValue;

        }catch (Throwable t){
            System.out.println("Logger类中的aroundPrintlog()方法开始记录日志了 异常");
            throw new RuntimeException(t);
        }finally {
            System.out.println("Logger类中的aroundPrintlog()方法开始记录日志了 最终");
        }
    }
}
