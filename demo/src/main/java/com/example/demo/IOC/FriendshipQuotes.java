package com.example.demo.IOC;

import java.util.ArrayList;
import java.util.Arrays;

//import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
public class FriendshipQuotes implements Quotes{
    @Override
    public ArrayList<String> getQuotes() {
     return new ArrayList<String>(Arrays.asList( 
      "friends are the chocolate chips",
      "True friendship comes when the silence between two people is comfortable",
      "A friend is someone who knows all about you and still loves you"));
    }
   //return Arrays.asList(" ");
  }

