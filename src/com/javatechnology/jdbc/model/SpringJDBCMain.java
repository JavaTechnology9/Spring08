package com.javatechnology.jdbc.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javatechnology.jdbc.service.PersonService;

public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringJDBCConfig.xml");
		PersonService service=(PersonService)context.getBean("personService");
		Person person=new Person();
		person.setId((long)123);
		person.setName("SPRING_JDBC");
		person.setAddress("JDBC");
		service.savePerson(person);
		

	}

}
