package com.fatma.jdk.proxy;

public class NotificationServiceImp implements NotificationService{
    @Override
    public void sendEmail(String to, String message) {
        System.out.println("To : "+to+" message: "+message);
    }

    @Override
    public void sendSms(String to, String message) {
        System.out.println("To : "+to+" message: "+message);
    }
}
