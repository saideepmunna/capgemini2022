package com.multipleChoice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class SourceClass {
	public static void main(String args[]) {
		
		Question ques = new Question();
		ques.setQno(1);
		ques.setQuesName("What is java");
		
		Answer ans1 = new Answer();
		ans1.setAnsId(101);
		ans1.setAns("Java is object oriented");
		
		Answer ans2 = new Answer();
		ans2.setAnsId(102);
		ans2.setAns("Java is query Language");
		
		Answer ans3 = new Answer();
		ans3.setAnsId(103);
		ans3.setAns("Java is Scripting language");
		
		ans1.setQuestion(ques); 
		ans2.setQuestion(ques); 
		ans3.setQuestion(ques); 
		
		ques.getAnswer().add(ans1);
		ques.getAnswer().add(ans2);
		ques.getAnswer().add(ans3);
		
		
		
		
		
		
		Configuration con = new Configuration().configure("com/hibernate.cfg.xml").addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(ques);
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		trans.commit();
		session.close();
		
		
	}
	
	
	
}
