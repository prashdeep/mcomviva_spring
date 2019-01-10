package com.classpath.aspects;

import com.classpath.model.Employee;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import java.util.List;

@Aspect
public class LoggingAspect {


    @Before("execution(* com.classpath.service.EmployeeServiceImpl.insertEmployee(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("logging before the method is getting executed");
        System.out.println(joinPoint);
    }

    @After("execution(* com.classpath.service.*.EmployeeServiceImpl*())")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("logging after the method has executed");
    }

    @Before("allPublicMethodsPointcut()")
    public void allServiceMethodsAdvice(){
        System.out.println("Before executing the service method");
    }

    @AfterReturning(pointcut = "execution(* findAllEmployees())", returning = "returnList")
    public void getNameReturningAdvice(List<Employee> returnList) {
        System.out.println("findAllEmployees executed. Returned List=" + returnList);
    }

    // Pointcut to execute on all the methods of classes in a package
    @Pointcut("within(com.classpath.*)")
    public void allPublicMethodsPointcut() {
    }
}