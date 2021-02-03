package com.javatechnology.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateMain {

	public static void main(String[] args) throws Exception {
		Configuration config=new Configuration()/*.configure("hibernate.cfg.xml")*/;
		config.addResource("Message.hbm.xml");
		config.addResource("Item.hbm.xml");
		config.addResource("Bid.hbm.xml");
		config.addResource("Category.hbm.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//Message message=new Message("Welcome to hibernate.properties");
		/*session.save(message);
		transaction.commit();*/
		/*System.out.println("session close");
		Message object = (Message)session.get(Message.class, (long)5);
		Message message=new Message("Next Message");
		object.setNextMessage(message);
		transaction.commit();
		System.out.println(object.getText());*/
		
		
		/*Set<Bid> bidSet=new HashSet<>();
		Bid bid1=new Bid();
		bid1.setAmount(120.0);
		Bid bid2=new Bid();
		bid2.setAmount(420.0);
		bidSet.add(bid1);
		bidSet.add(bid2);
		
		Item item=new Item();
		item.setBidSet(bidSet);
		item.setCreatedDate(new Date());
		item.setDescription("Computer Description");
		item.setName("COMPUTER");
		item.setPrice(450.0);
		bid1.setItem(item);
		bid2.setItem(item);
		session.save(item);
		transaction.commit();*/
		/*Category category=new Category();
		category.setCategoryName("Computer");
		session.save(category);*/
		Category computer=(Category)session.get(Category.class, (long)1);
		//session.close();
		/*Category laptops=new Category();
		laptops.setCategoryName("Laptops");
		computer.getChildCategory().add(laptops);
		laptops.setParentCategory(computer);*/
		//transaction.commit();
		Category laptops=new Category();
		laptops.setCategoryName("Laptops");
		
		Category laptopsAccessories=new Category();
		laptopsAccessories.setCategoryName("LaptopsAccessories");
		
		Category tabletPC=new Category();
		tabletPC.setCategoryName("TabletPC");
		laptops.addChildCategory(laptopsAccessories);
		laptops.addChildCategory(tabletPC);
		//computer .addChildCategory(laptops);
		
		
		
		/*Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();*/
		session.save(laptops);
		transaction.commit();

		

	}

}
