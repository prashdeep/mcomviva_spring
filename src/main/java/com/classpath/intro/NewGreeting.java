package com.classpath.intro;

public class NewGreeting implements Greeter{

    public void greet(String message){
        System.out.println("Greeting with new message :: "+message);
    }
}