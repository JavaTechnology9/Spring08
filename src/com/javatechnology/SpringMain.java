package com.javatechnology;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("C:\\Users\\Suresh\\Downloads\\Spring&Springboot&Hibernate1\\SpringCore\\src\\SpringConfig.xml"));
		/*GreetingService service=(GreetingService)factory.getBean("greetingService");
		service.sayGreeting();*/
		//ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\\\Users\\\\Suresh\\\\Downloads\\\\Spring&Springboot&Hibernate1\\\\SpringCore\\\\src\\\\SpringConfig.xml");
		Performer performer=(Performer)context.getBean("performer");
		performer.perform();
		
	}

}
