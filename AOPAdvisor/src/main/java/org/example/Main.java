package org.example;

import org.example.advisor.AfterLoading;
import org.example.advisor.BeforeLoading;
import org.example.advisor.InterseptorLoading;
import org.example.advisor.ThrowLoading;
import org.example.service.InventoryServiceImp;
import org.example.service.InventoryServiceInterface;
import org.springframework.aop.framework.ProxyFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        InventoryServiceInterface serviceInterface = new InventoryServiceImp();

        ProxyFactory proxyFactory=new ProxyFactory();
        proxyFactory.setTarget(serviceInterface);
        proxyFactory.addAdvice(new InterseptorLoading());
        proxyFactory.addAdvice(new BeforeLoading());
        proxyFactory.addAdvice(new AfterLoading());
        proxyFactory.addAdvice(new ThrowLoading());

        InventoryServiceInterface serviceInterface1= (InventoryServiceInterface) proxyFactory.getProxy();
        serviceInterface1.checkStock("Hello");
    }
}