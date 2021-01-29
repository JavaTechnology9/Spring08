package com.javatechnology;

public class AutoWireExample implements Performer {
	private String name;
	private Poem poem;

	public AutoWireExample(String name, Poem poem) {
		super();
		this.name = name;
		this.poem = poem;
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
