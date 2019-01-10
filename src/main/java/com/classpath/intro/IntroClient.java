package com.classpath.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml");
        Greeter greeter = applicationContext.getBean("greeter", Greeter.class);
        greeter.greet("Welcome to Bangalore");

    }
}