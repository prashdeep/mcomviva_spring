package com.classpath.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        VegasOracleDB oracleDB = context.getBean("vegas",VegasOracleDB.class);
        System.out.println("Name : "+oracleDB.getName() + " Url: "+oracleDB.getUrl());
    }
}