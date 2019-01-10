package com.classpath.autowire;

public class OrderRepositoryImpl  implements OrderRepository{

    public void persistOrder(String orderItem) {
        System.out.println("Order created ..");
    }
}