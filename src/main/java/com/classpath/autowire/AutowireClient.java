package com.classpath.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        OrderService orderService = context.getBean("orderService", OrderServiceImpl.class);
        orderService.createOrder("IPhone-X");


    }
}