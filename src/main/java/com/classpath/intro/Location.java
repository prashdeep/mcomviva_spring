package com.classpath.intro;

public class Location {

    private String state;
    private String city;

    public Location(String city, String state){
        this.city = city;
        this.state = state;
        System.out.println("Called from the constructor of Location");
    }

    public String getState(){
        return this.state;
    }

    public String getCity(){
        return this.city;
    }
}