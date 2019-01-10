package com.classpath.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigClient {

    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AccountService accountService =
                applicationContext.getBean("accountService", AccountService.class);

        accountService.execute();
    }
}