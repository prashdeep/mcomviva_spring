package com.classpath.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FactoryClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Account account = context.getBean("accountService", Account.class);
        System.out.println(account);
        ((AbstractApplicationContext)context).registerShutdownHook();
    }
}