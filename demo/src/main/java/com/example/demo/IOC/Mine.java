package com.example.demo.IOC;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Mine {
   public Mine(){
        System.out.println("constructor");
    }
    public void hello(){
        System.out.println("hello");
    }
}
