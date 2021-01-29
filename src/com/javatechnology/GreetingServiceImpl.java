package com.javatechnology;

public class GreetingServiceImpl implements GreetingService{
	
	private String greeting;
	public GreetingServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public GreetingServiceImpl(String greeting) {
		this.greeting=greeting;
	}

	@Override
	public void sayGreeting() {
		System.out.println(greeting);
		
	}
	public void setGreeting(String greeting) {
		this.greeting=greeting;
	}

}
