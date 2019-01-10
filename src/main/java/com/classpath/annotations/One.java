package com.classpath.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class One {

    @Autowired
    private Two two;

    public One(Two two){
        this.two = two;
    }

    public void execute(){
        two.execute();
    }
}