package org.example.config;

import org.example.advisor.BeforeLoading;
import org.example.service.InventoryServiceImp;
import org.example.service.InventoryServiceInterface;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public InventoryServiceInterface getInventory(){
        return new InventoryServiceImp();
    }

    @Bean
    public MethodBeforeAdvice getBeforeAdvice(){
        return new BeforeLoading();
    }



//    @Bean
//    public ProxyFactoryBean getProxy( InventoryServiceInterface inventoryServiceInterface){
//        ProxyFactoryBean proxyFactoryBean=new ProxyFactoryBean();
//        proxyFactoryBean.setTarget(inventoryServiceInterface);
//        proxyFactoryBean.setInterceptorNames("getBeforeAdvice");
//        return proxyFactoryBean;
//    }
}
