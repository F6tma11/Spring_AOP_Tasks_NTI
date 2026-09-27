package com.fatma.jdk.proxy;

import java.lang.reflect.Proxy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        NotificationService notificationService=new NotificationServiceImp();

        NotificationService notificationServiceProxy= (NotificationService) Proxy.newProxyInstance(
                NotificationService.class.getClassLoader(),
                new Class[]{NotificationService.class,NoImplements.class},
                new LoggingHandler(notificationService)
        );


        notificationServiceProxy.sendEmail("Fatma Ahmed","Hello be happy and calm you will achieve your goals,I believe you");

        //static proxy

        NotificationService notificationService1=new NotificationServiceProxy(new NotificationServiceImp());
        notificationService1.sendEmail("fatma","fatma email");
    }
}