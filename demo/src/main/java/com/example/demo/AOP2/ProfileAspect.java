package com.example.demo.AOP2;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class ProfileAspect {
    @Pointcut(value = "execution (* com.example.demo.AOP2.OrderService.*(..))")
	public void orderMethods() {

	}

	@Pointcut(value = "execution (* com.example.demo.AOP2.PaymentService.*(..))")
	public void paymentMethods() {
	}

	// Before Advice
	@Before("orderMethods() || paymentMethods()")
	public void beforeAdviceMethod() {
		System.out.println("Before Profile Advice --> ");
	}


}
