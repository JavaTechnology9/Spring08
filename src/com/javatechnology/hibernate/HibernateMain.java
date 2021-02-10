package com.javatechnology.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;

public class HibernateMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		Configuration config=new Configuration()/*.configure("hibernate.cfg.xml")*/;
		config.addResource("Message.hbm.xml");
		config.addResource("Item.hbm.xml");
		config.addResource("Bid.hbm.xml");
		config.addResource("Category.hbm.xml");
		config.addResource("Address.hbm.xml");
		config.addResource("User.hbm.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		//Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
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
		//Category computer=(Category)session.get(Category.class, (long)1);
		//session.close();
		/*Category laptops=new Category();
		laptops.setCategoryName("Laptops");
		computer.getChildCategory().add(laptops);
		laptops.setParentCategory(computer);*/
		//transaction.commit();
		/*Category laptops=new Category();
		laptops.setCategoryName("Laptops");
		
		Category laptopsAccessories=new Category();
		laptopsAccessories.setCategoryName("LaptopsAccessories");
		
		Category tabletPC=new Category();
		tabletPC.setCategoryName("TabletPC");
		laptops.addChildCategory(laptopsAccessories);
		laptops.addChildCategory(tabletPC);
		//computer .addChildCategory(laptops);
		
		
		
		Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();
		session.save(laptops);
		transaction.commit();*/

		/*Address address =new Address();
		address.setCity("HYderabad");
		address.setStreet("Hitech-City");
		address.setZipcode("500001");
		
		User user =new User();
		user.setFirstname("ONE");
		user.setLastName("TO_ONE");
		address.setUser(user);
		user.setAddress(address);
		
		session.save(user);
		transaction.commit();*/
		
		/*Set<Category> categorySet=new HashSet<>();
		Set<Item> itemSet=new HashSet<>();
		
		Category category=new Category();
		category.setCategoryName("MANY_TO_MANY");
		
		Category category1=new Category();
		category1.setCategoryName("MANY_TO_MANY1");
		
		categorySet.add(category1);
		categorySet.add(category);
		
		Item item=new Item();
		item.setCreatedDate(new Date());
		item.setDescription("Computer Description");
		item.setName("COMPUTER");
		item.setPrice(450.0);
		
		Item item1=new Item();
		item1.setCreatedDate(new Date());
		item1.setDescription("Computer Description");
		item1.setName("COMPUTER");
		item1.setPrice(450.0);
		
		Set<Bid> bidSet=new HashSet<>();
		Bid bid1=new Bid();
		bid1.setAmount(120.0);
		Bid bid2=new Bid();
		bid2.setAmount(420.0);
		bidSet.add(bid1);
		bidSet.add(bid2);
		item.setBidSet(bidSet);
		item1.setBidSet(bidSet);
		bid1.setItem(item);
		bid2.setItem(item1);
		
		
		itemSet.add(item);
		itemSet.add(item1);
		category.setItems(itemSet);
		category1.setItems(itemSet);
		item.setCategory(categorySet);
		item1.setCategory(categorySet);
		
		session.save(category);
		transaction.commit();*/
		
		
		//@SuppressWarnings("unchecked")
		//List<User> list = (List<User>)session.createQuery("from User u where u.lastName=?").setString(0, "TO_ONE").setMaxResults(2).list();
		//List<User> list=session.getNamedQuery("loaduserObjectByName").setString(0, "TO_ONE").setMaxResults(2).list();
		//List<User> list = session.createCriteria(User.class).addOrder(Order.asc("lastName")).setMaxResults(2).list();
		//List<User> list=session.createSQLQuery("select {u.*} from hibernate.User {u} ","u",User.class).list();
		/*list.forEach(action->{
			System.out.print(action.getFirstname()+ " "+action.getLastName());
			System.out.println();
		});*/
		/*Category list =(Category) session.createQuery("from Category c order by c.categoryName desc ").setMaxResults(1).uniqueResult();
		session.createCriteria(Category.class).add(Expression.eq("id", 1)).setMaxResults(1).uniqueResult();
		System.out.println(list.getCategoryName());*/
		
		
		

	}

}
