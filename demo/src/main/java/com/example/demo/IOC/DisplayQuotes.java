package com.example.demo.IOC;

public class DisplayQuotes {
    private Quotes friendshipquotes;
    private Quotes hardworkquotes;
    
    public DisplayQuotes(Quotes friendshipquotes,Quotes hardworkquotes){
    this.friendshipquotes=friendshipquotes;
    this.hardworkquotes=hardworkquotes;
    }

  public void print(){
    System.out.println(friendshipquotes.getQuotes());
    System.out.println(hardworkquotes.getQuotes());
   }
   

}
