package com.classpath.javaconfig;

public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public void execute(){
        this.accountRepository.execute();
    }
}