package com.example.demo.AOP;

import org.springframework.stereotype.Component;

@Component
public class Payment {
    Payment(){
        
    }
    public void doPayment(){
        System.out.println("payment");
    }

    public boolean process(String card){
        System.out.println("processing");
        if(card.length() > 0)
            return true;
            
        return false;
    }

    public void validateCC(){
        System.out.println("validating");
    }
}
