package com.classpath.profile;

import org.springframework.context.annotation.Profile;

@Profile("dev")
public class User {

    private long id ;
    private String name;

    public User(long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}