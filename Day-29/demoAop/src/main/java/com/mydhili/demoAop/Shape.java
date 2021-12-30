package com.mydhili.demoAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Shape implements ThrowsAdvice{

    @Before("execution(public void show*())")
    public void before(){
        System.out.println("Area");
    }

    @Before("execution(public void *Show())")
    public void beforeLog(){
        System.out.println("Perimeter");
    }
    @After("execution(public void show*())")
    public void After(){
        System.out.println("*****Area is calculated*****");
    }
    @After("execution(public void *Show())")
    public void AfterLog(){
        System.out.println("*****Perimeter is calculated*****");
    }


@Pointcut("execution(public void *Get*())")
    public void pointCutOne(){}

    @Before("pointCutOne()")
    public void beforeValues(){
        System.out.println("***** getting values for operation *****");

    }

    @After("pointCutOne()")
    public void afterValues(){
        System.out.println("**** values are read successfully");
    }

    @Pointcut("execution(public void process())")
    public void pointCutTwo(){}

    @Around("pointCutTwo()")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("<<<<<<<< Starts the operation >>>>>>>");
    proceedingJoinPoint.proceed();
        System.out.println("<<<<<<<< Ends the operation >>>>>>>");

}


    @AfterReturning(
            pointcut="execution(public String processResult())",
            returning="returnValue")
    public void runAfter(JoinPoint joinPoint, String returnValue) throws Throwable {

        System.out.println("Inside Shape.afterReturning() method...");
        System.out.println("inserted after : " + joinPoint.getSignature().getName());
        System.out.println("Method returned value is : " + returnValue);
    }
    @AfterThrowing(
            pointcut="execution(public String testThrowException())",
            throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Throwable exception) throws Throwable {
        System.out.println("Inside CatchThrowException.afterThrowing() method...");
        System.out.println("Running after throwing exception...");
        System.out.println("Exception : " + exception);
    }
}
