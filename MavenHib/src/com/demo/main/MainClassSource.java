package com.demo.main;


import org.hibernate.cfg.Configuration;

import com.demo.App.Alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClassSource {
	public static void main(String args[]) {
		
		Configuration con = new Configuration().configure("com/demo/App/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Alien telusko = new Alien();
		telusko.setAid(101);
		telusko.setaName("Saideep");
		telusko.setColor("Green");
		
		Session session = sf.openSession();
		
		Transaction trans = session.beginTransaction(); //As we are changing a Database we need to follow acid properties
		session.save(telusko);
		trans.commit();
		
		session.close();
	}

}
