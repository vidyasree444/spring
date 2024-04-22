package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.AOP.Payment;
import com.example.demo.AOP2.OrderService;
import com.example.demo.AOP2.PaymentService;

 
// import com.example.demo.IOC.DisplayQuotes;
// import com.example.demo.IOC.FriendshipQuotes;
// import com.example.demo.IOC.HardworkQuotes;
// import com.example.demo.IOC.Mine;
// import com.example.demo.IOC.PrintQuotes;
// import com.example.demo.IOC.Quotes;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
 // @Autowired
  //Mine obj;

  //@Autowired
  //Payment p;

    @Autowired
	private OrderService order;

	@Autowired
	private PaymentService payment;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		/*Quotes q =new FriendshipQuotes();
		Quotes q1 = new HardworkQuotes();
		PrintQuotes pq=new PrintQuotes(q,q1);
		pq.print();
        System.out.println("-----------------------------");*/
        
        //================================PRIMARY=====================================
		/*ApplicationContext context = new AnnotationConfigApplicationContext(FriendshipQuotes.class);
        Quotes q = context.getBean(FriendshipQuotes.class);
		q.getQuotes();*/
        //================================QUALIFIER===================================
		/*Quotes q =new HardworkQuotes();
		PrintQuotes pq=new PrintQuotes(q);
		pq.print();*/


	}

	@Override
	public void run(String... args) throws Exception {
	 //p.doPayment();
     //p.process("hi");

	    order.placeOrder();
		order.cancelOrder(1);
		payment.process();
	 
	}
}
