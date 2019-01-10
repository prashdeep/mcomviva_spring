package com.classpath.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Two {

    @Autowired
    private Three three;

    public Two(Three three){
        this.three = three;
    }

    public void execute(){
        three.execute();
    }
}