package com.newScope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCalss {
	public static void main(String[] args) {
	
   	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloJava.class);
   	HelloJava helloJava= (HelloJava) context.getBean(HelloJava.class);
   	helloJava.setMessage("HelloWorld");
	System.out.println(helloJava.getMessage());
	System.out.println(helloJava);
	
	HelloJava helloJava1= (HelloJava) context.getBean(HelloJava.class);
   	
	System.out.println(helloJava1);
	}
}
