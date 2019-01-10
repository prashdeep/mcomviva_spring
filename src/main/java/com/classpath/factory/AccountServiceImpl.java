package com.classpath.factory;

public class AccountServiceImpl implements  AccountService {

    private AccountServiceImpl(){}

    public static Account getInstance(){
        System.out.println("Called inside the getInstance method..");
        return new Account(1,"Kiran", 2000);
    }
}