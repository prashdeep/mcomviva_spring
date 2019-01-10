package com.classpath.autowire;

public class NewOrderRepositoryImpl implements OrderRepository {
    public void persistOrder(String orderItem) {
        System.out.println("Order persisted ...");
    }
}