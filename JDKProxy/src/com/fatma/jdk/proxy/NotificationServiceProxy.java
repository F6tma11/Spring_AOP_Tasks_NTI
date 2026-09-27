package com.fatma.jdk.proxy;

public class NotificationServiceProxy implements NotificationService {
    private final NotificationService notificationService;
    public NotificationServiceProxy(NotificationService notificationService){
        this.notificationService=notificationService;
    }


    @Override
    public void sendEmail(String to, String message) {
        System.out.println("before Send email notify proxy");
        notificationService.sendEmail("fatma","email fatma");
        System.out.println("After Send email notify proxy");
    }

    @Override
    public void sendSms(String to, String message) {
        System.out.println("before Send sms notify proxy");
        notificationService.sendEmail(to,message);
        System.out.println("After Send sms notify proxy");
    }
}
