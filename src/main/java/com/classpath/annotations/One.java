package com.classpath.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class One {

    @PostConstruct
    public void beforeConstruction(){
        System.out.println("Called inside the init method");
    }

    @PreDestroy
    public void beforeDestruction(){
        System.out.println("called inside the destroy method");
    }

    @Autowired
    private Two two;

    public One(Two two){
        this.two = two;
    }

    public void execute(){
        two.execute();
    }
}