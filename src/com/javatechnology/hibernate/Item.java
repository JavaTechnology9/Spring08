package com.javatechnology.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Item {
	private Long id;
	private String name;
	private String description;
	private Date CreatedDate;
	private double price;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	private Set<Category> category=new HashSet<>();
	
	private Set<Bid> bidSet=new HashSet<>();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Category> getCategory() {
		return category;
	}
	public void setCategory(Set<Category> category) {
		this.category = category;
	}
	public Set<Bid> getBidSet() {
		return bidSet;
	}
	public void setBidSet(Set<Bid> bidSet) {
		this.bidSet = bidSet;
	}
	
	

}
