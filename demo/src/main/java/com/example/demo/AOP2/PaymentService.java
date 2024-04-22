package com.example.demo.AOP2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void process() {
        System.out.println("Processing Payment");
    }
}
