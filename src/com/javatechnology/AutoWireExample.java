package com.javatechnology;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("performer")
public class AutoWireExample implements Performer {
	@Value("autowire")
	private String name;
	@Autowired
	private Poem poem;
	
	/*public AutoWireExample(String name, Poem poem) {
		super();
		this.name = name;
		this.poem = poem;
	}*/
	public AutoWireExample() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public void setName(String name) { this.name = name; }
	 * 
	 * 
	 * 
	 * public void setPoem(Poem poem) { this.poem = poem; }
	 */

	public void tuneAutowire() {
		System.out.println("tuneAutowire method is called");
	}

	public void cleanAutowire() {
		System.out.println("cleanAutowire methos is called");
	}

	@Override
	public void perform() {
		System.out.println("Autowire: " + name);
		poem.work();

	}

}
