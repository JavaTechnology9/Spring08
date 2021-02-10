package com.javatechnology.jdbc.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.javatechnology.JdbcConfiguration;
import com.javatechnology.jdbc.service.PersonService;

public class SpringJDBCMain {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("SpringJDBCConfig.xml");
		AbstractApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfiguration.class);
		PersonService service=(PersonService)context.getBean("personService");
		Person person=new Person();
		person.setId((long)329);
		person.setName("SPRING_HIBERNATE_ANNOTATIONS");
		person.setAddress("NAMED_PARAMETER");
		System.out.println(service.savePerson(person));
		

	}

}
