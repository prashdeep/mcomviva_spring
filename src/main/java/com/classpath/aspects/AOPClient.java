package com.classpath.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");

        Target obj = applicationContext.getBean("proxyGreet", Target.class);
        obj.greet("welcome ....");
    }
}