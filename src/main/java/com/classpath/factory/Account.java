package com.classpath.factory;

public class Account {
    private int id;

    private String name;

    private double balance;

    public Account(int id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}