package com.javatechnology;

import org.springframework.stereotype.Component;

@Component
public class PoemImpl implements Poem{

	@Override
	public void work() {
		System.out.println("work methdo is called");
		
	}

}
