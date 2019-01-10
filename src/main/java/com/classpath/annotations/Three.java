package com.classpath.annotations;

import org.springframework.stereotype.Component;

@Component
public class Three {

    public void execute(){
        System.out.println("Cascading the execute call till Three !!");
    }
}