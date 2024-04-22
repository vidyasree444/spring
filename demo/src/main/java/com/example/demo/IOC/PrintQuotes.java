package com.example.demo.IOC;
//import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class PrintQuotes {
    private Quotes friendshipquotes;
    private Quotes hardworkquotes;
    
    @Autowired
    public PrintQuotes(@Qualifier("HardworkQuotes")Quotes friendshipquotes,Quotes hardworkquotes){
    this.friendshipquotes=friendshipquotes;
    this.hardworkquotes=hardworkquotes;
    }

  public void print(){
    System.out.println(friendshipquotes.getQuotes());
    System.out.println(hardworkquotes.getQuotes());
   }
   
   
}
