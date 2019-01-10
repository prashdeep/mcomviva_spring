package com.classpath.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IntroClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application-context.xml" );
        Greeter greeterOne = applicationContext.getBean("greeter", Greeter.class);
        //greeter.greet("Welcome to Bangalore");
        Greeter greeterTwo = applicationContext.getBean("greeter", Greeter.class);

        System.out.println("Check, if greeterOne equals greeterTwo "+(greeterOne == greeterTwo));

        //greeter.setLocation(new Location("chennai", "TN"));

        //greeter.greet("location changed ..");

        ((AbstractApplicationContext)applicationContext).registerShutdownHook();

    }
}