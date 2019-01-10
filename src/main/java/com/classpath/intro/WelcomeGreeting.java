package com.classpath.intro;

public class WelcomeGreeting implements Greeter{

    private String greetStr;
    private int age;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Location location;

    public void init(){
     //   System.out.println("Came inside the initialization method");
    }

    public void destroy(){
     //   System.out.println("Came inside the destroy method..");
    }

    WelcomeGreeting(String greetStr, int age){
        this.greetStr = greetStr;
        this.age = age;
        System.out.println("called from the constructor or WelcomeGreeting");
    }

    public void greet(String message){
        System.out.println(greetStr +message+". You turned "+this.age+ " as of today. Welcome to " + this.location.getCity() );
    }


}