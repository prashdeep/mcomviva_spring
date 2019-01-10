package com.classpath.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Organization organization = context.getBean("organization", Organization.class);

        System.out.println(organization.getDepts());
        System.out.println(organization.getDepartments());
    }
}