package org.example.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectAdvisor {

    private Long time;

    @Before("execution(* org.example.service.*.*(..))")
    public void beforeMethod(JoinPoint jp){
        System.out.println("Started at : "+System.currentTimeMillis());
        time=System.currentTimeMillis();
    }

    @After("org.example.custompointcut.PointCutPath.getPointCut()")
    public void afterMethod(JoinPoint jp){
        System.out.println("Ends at : "+System.currentTimeMillis());
    }

    @Around("org.example.custompointcut.PointCutPath.getAnnotation()")
    public Object aroundMethod(ProceedingJoinPoint proceed) throws Throwable {
        System.out.println("Start method : "+System.currentTimeMillis());
        Object result =proceed.proceed();
        System.out.println("Ends method : "+System.currentTimeMillis());
        return result;
    }

    @AfterReturning("org.example.custompointcut.PointCutPath.getPointCut()")
    public void afterMethodReturn(JoinPoint jp){
        System.out.println("Method take "+(System.currentTimeMillis()-time));

    }


}
