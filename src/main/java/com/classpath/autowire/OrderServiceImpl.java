package com.classpath.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderServiceImpl implements OrderService {


    private OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(@Qualifier("orderRepository1") OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    public void createOrder(String productName) {
        this.orderRepository.persistOrder(productName);
    }
}