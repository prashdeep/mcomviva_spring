package com.classpath.aspects;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class AuthAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(" Method name: "+method.getName());
        System.out.println("Arguments "+objects);

    }
}