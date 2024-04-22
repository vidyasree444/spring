package com.example.demo.IOC;

import java.util.ArrayList;
import java.util.Arrays;

//import org.springframework.context.annotation.Primary;

public class HardworkQuotes implements Quotes {
     @Override
     //@Primary
    public ArrayList<String> getQuotes() {
      return new ArrayList<String>(Arrays.asList("Hard work beats talent when talent doesn't work hard",
      "The dream is free, but the hustle is sold separately",
      "The only way to achieve the impossible is to believe it is possible"));
    }
}
