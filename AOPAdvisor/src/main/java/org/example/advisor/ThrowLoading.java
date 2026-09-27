package org.example.advisor;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class ThrowLoading implements ThrowsAdvice {

    public void throwException(Exception e){
        System.out.println("Exception : "+e.getMessage());
    }

    public void afterThrowing(Method method, Object[] args, Object target,
                              Exception ex) {
        System.out.println("ERROR in " + method.getName() + ": " +
                ex.getMessage());
    }
}
