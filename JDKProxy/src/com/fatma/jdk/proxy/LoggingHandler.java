package com.fatma.jdk.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingHandler implements InvocationHandler {

    private final Object target;
    public LoggingHandler(Object target){this.target=target;}
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName=method.getName();
        switch (methodName){
            case "sendEmail":
                System.out.println("We send emails");
                break;
            case "sendSms":
                System.out.println("We send sms");
                break;
            default:
                System.out.println("You don't invoke any method");
        }

        System.out.println("LOG : "+method.getName());
        Object result=method.invoke(target,args);
        System.out.println("LOG : "+method.getName());
        return result;
    }
}
