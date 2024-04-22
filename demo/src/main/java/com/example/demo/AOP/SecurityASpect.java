package com.example.demo.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityASpect {
    @Before("execution(* com.example.demo.AOP.Payment.doPayment(..))")
    public void beforePayment(){
        System.out.println("Before advice payemnt");
    }

    @After("execution(* com.example.demo.AOP.Payment.validateCC(..))")
    public void afterValidateCC(){
        System.out.println("After advice validate cc");
    }

    @Around("execution(* com.example.demo.AOP.Payment.process(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("before around...");

        Object result = pjp.proceed();

        System.out.println("After around...");

        return result;
    }
}
