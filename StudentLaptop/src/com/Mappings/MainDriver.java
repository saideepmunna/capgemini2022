package com.Mappings;





import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDriver {
  public static void main(String args[]) {
	  
	  Laptop laptop = new Laptop();
	  laptop.setLid(101);
	  laptop.setLname("Dell");

	  Student student = new Student();
	  student.setRollno(1);
	  student.setName("Saideep");
	  student.setMarks(50);
	  
	  
	  student.getLaptop().add(laptop) ;
	  laptop.setStudent(student);
	  
	  Configuration con = new Configuration().configure("com/hibernate.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
	     session.save(student);
	     session.save(laptop);
	     trans.commit();
	     session.close();
		
  }

}
