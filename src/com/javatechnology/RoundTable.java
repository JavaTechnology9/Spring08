package com.javatechnology;

import org.springframework.beans.factory.BeanNameAware;

public class RoundTable implements BeanNameAware{
	private String name;
	private Quest quest;	
	public RoundTable() {
		// TODO Auto-generated constructor stub
	}
	
	public RoundTable(String name, Quest quest) {
		this.name=name;
		this.quest=quest;
	}
	
	public void embark() {
		System.out.println(name);
		quest.embark();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Quest getQuest() {
		return quest;
	}

	public void setQuest(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("setBeanName method is called");
		
	}
	
	

}
