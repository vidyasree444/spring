package com.example.demo.AOP2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(0)
public class LogAspect {
    public LogAspect() {
		System.out.println("LogAspect()");
	}

	// Before Advice
	@Before(value = "execution (* com.example.demo.AOP2.OrderService.*(..))") // pointcut
	public void beforeAdviceMethod() {
		System.out.println("Before Advice --> ");
	}

	@After(value = "execution (* com.example.demo.AOP2.OrderService.placeOrder(..))")
	public void afterAdviceMethod() {
		System.out.println("After Advice --> " );
	}

	@Around(value = "execution (* com.example.demo.AOP2.OrderService.get*(..))")
	public Object aroundAdviceMethod(ProceedingJoinPoint pjp) {
		System.out.println("Before calling : " + pjp.getSignature());
		try {
			Object obj = pjp.proceed(pjp.getArgs());
			System.out.println("Success : " + obj);
			return obj;
		} catch (Throwable ex) {
			System.out.println("Exception : " + ex);
			return null;
		}
	}

	// After Throwing
	@AfterThrowing(value = "execution (* com.example.demo.AOP2.OrderService.*(..))", throwing = "ex")
	public void afterThrowingAdviceMethod(JoinPoint jp, Exception ex) {
		System.out.println("After Throwing Advice --> " + jp.getSignature());
		System.out.println("Exception is : " + ex.getMessage());
	}
}
