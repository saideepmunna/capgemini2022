package com.DemoMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyApp {

	public static void main(String[] args) {
		
		AlienName name = new AlienName();
		name.setFirst_name("Saideep");
		name.setLast_name("Gajula");
		name.setMiddle_name("Goud");
		
		MyAlien obj = new MyAlien() ;
		obj.setAid(101);
		obj.setaName(name);
		obj.setColor("Purple");
		Configuration con = new Configuration().configure("com/hibernate.cfg.xml").addAnnotatedClass(com.DemoMaven.MyAlien.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
	    //obj = (MyAlien)session.get(MyAlien.class,102); To get the data from the database .get(Class_name, Primary_id)
		
		session.save(obj); //To save the object into the Database
		trans.commit();
		
		System.out.println(obj.toString());
		session.close();
		
		
		
	}

}
