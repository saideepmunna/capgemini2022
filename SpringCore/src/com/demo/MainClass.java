package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		//It is a IoC (Inverse of Control) add dependency in the pom
		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml"); //Created a Spring Container.It is a interface hence find class that implements it 
         
		//now we need bean xml file
		Message message = (Message) appContext.getBean("myMessage");
        System.out.println(message.getMessage());
        message.show();
	}

}
