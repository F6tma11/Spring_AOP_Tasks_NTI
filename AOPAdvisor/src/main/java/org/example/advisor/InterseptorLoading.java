package org.example.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class InterseptorLoading implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Long start=System.currentTimeMillis();
        System.out.println("Start at : "+start);
        Object result=invocation.proceed();
        System.out.println("End at : "+(System.currentTimeMillis()-start));
        return result;
    }
}
