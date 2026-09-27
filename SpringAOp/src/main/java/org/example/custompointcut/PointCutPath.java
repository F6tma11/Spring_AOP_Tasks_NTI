package org.example.custompointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCutPath {
    @Pointcut("execution(* org.example.service.*.*(..))")
    public void getPointCut(){}

    @Pointcut("@annotation(org.example.customannotation.Timable)")
    public void getAnnotation(){}
}
