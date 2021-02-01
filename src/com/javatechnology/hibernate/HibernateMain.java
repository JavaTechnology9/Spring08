package com.javatechnology.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateMain {

	public static void main(String[] args) {
		Configuration config=new Configuration()/*.configure("hibernate.cfg.xml")*/;
		config.addResource("Message.hbm.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Message message=new Message("Welcome to hibernate.properties");
		session.save(message);
		transaction.commit();
		System.out.println("session close");
		Message object = (Message)session.get(Message.class, (long)5);
		System.out.println(object.getText());
		session.close();

	}

}
