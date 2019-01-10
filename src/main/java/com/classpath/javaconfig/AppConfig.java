package com.classpath.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public AccountService accountService(){
        AccountRepository accountRepository = new AccountRepository();
        AccountService accountService = new AccountService(accountRepository);
        return  accountService;
    }

    @Bean("accountRepository")
    public AccountRepository repository(){
        return new AccountRepository();
    }
}