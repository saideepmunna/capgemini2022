package com.munna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/neww/spring.xml");
//		Vehicle obj = (Vehicle) context.getBean("bike");
//		obj.drive();
		Tyre tyre = (Tyre) context.getBean("tyre");
		System.out.println(tyre);

	}

}
