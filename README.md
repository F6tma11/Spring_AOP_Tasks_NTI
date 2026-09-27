# Spring AOP Labs

This repository contains two labs for practicing **Java Dynamic Proxies and Spring AOP** using plain Spring Framework without Spring Boot.

## Lab 1 — JDK Dynamic Proxy

Implemented a custom JDK Dynamic Proxy using `Proxy` and `InvocationHandler`.

### Features

* Created `NotificationService` interface.
* Implemented `NotificationServiceImpl`.
* Created `LoggingHandler` to:

  * Log method name and arguments before execution.
  * Call the real method.
  * Log the return value.
  * Measure and print execution time.
* Created a proxy using `Proxy.newProxyInstance()`.
* Tested the proxy with `sendEmail()` and `sendSms()`.

## Lab 2 — Spring AOP

Implemented different Spring AOP advice types using a plain Spring project.

### Part A — Programmatic AOP

Used `ProxyFactory` with:

* `MethodBeforeAdvice` — logs method name and arguments.
* `AfterReturningAdvice` — logs the returned value.
* `ThrowsAdvice` — handles exceptions thrown by `reserveStock()`.
* `MethodInterceptor` — measures execution time using `try/finally`.

Also implemented:

* `InventoryService` interface.
* `InventoryServiceImpl`.
* `reserveStock()` exception scenario when the requested quantity is greater than the available stock.
* AOP proxy using `ProxyFactory`.

### Spring ApplicationContext

Configured the same AOP setup using:

* `@Configuration`
* `ProxyFactoryBean`
* Spring `ApplicationContext`

The proxy is managed by the Spring container and can be injected into other components.

### Bonus — Pointcut

Used `NameMatchMethodPointcut` to apply `MethodBeforeAdvice` only to the `reserveStock()` method.

This verifies that:

* `reserveStock()` is logged.
* `checkStock()` is not logged by the configured before advice.

## Part B — Annotation-Based AOP

Practiced the core Spring AOP annotations:

* `@Before`
* `@AfterReturning`
* `@AfterThrowing`
* `@After`
* `@Around`

The four individual advices were then replaced with a single `@Around` advice to handle the complete method execution flow.

## Technologies

* Java
* Spring Context
* Spring AOP
* JDK Dynamic Proxy
* Maven
* Spring Framework
* No Spring Boot

## Concepts Practiced

* JDK Dynamic Proxy
* `InvocationHandler`
* Proxy-based AOP
* Before Advice
* After Returning Advice
* Throws Advice
* Around Advice
* Pointcuts
* `ProxyFactory`
* `ProxyFactoryBean`
* Spring `ApplicationContext`
* Annotation-based AOP
* `@annotation()` pointcuts
* Custom annotations
