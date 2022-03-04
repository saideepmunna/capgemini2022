package com.demo.logic;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.pojo.Answer;
import com.demo.pojo.Question;

public class Service {

	private static SessionFactory sessionFactory = null;
	Transaction transcation = null;
	Integer empployeeid = null;
	Session sessiong = null;

	ArrayList<Answer> list1 = new ArrayList<Answer>();

	public void showLogic() {

		// intilize the session
		Session session = null;
		sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sessionFactory.openSession();

		// begin transcation

		transcation = session.beginTransaction(); // session need always a transctation start object
		// set ans for question 1
		Answer ans1 = new Answer();
		ans1.setAnswername("Java is a programming language");
		ans1.setPostedBy("sai deep");

		// set ans for question 1
		Answer ans2 = new Answer();
		ans2.setAnswername("Java is a oops");
		ans2.setPostedBy("sai deep");

		// set ans for question 1
		Answer an32 = new Answer();
		ans1.setAnswername("Java is a platform indep..");
		ans1.setPostedBy("sai deep");

		// set question as 1
		Question question1 = new Question();
		question1.setQname("What is Java?");

		list1.add(ans1);
		list1.add(ans2);

		question1.setAnswers(list1);// passing args as list

		session.save(question1); // added to session
		transcation.commit();

	}

}
