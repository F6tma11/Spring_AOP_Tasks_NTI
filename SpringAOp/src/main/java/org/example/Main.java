package org.example;

import org.example.config.AppConfig;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService=(AccountService) context.getBean("accountService");

        accountService.balance();
//        accountService.withdrow(1500,"timable");
    }
}