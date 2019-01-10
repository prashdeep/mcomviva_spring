package com.classpath.intro;

public class WelcomeGreeting implements Greeter{

    private String greetStr;
    private int age;
    WelcomeGreeting(String greetStr, int age){
        this.greetStr = greetStr;
        this.age = age;
    }

    public void greet(String message){
        System.out.println(greetStr +message+". You turned "+this.age+ " as of today");
    }
}