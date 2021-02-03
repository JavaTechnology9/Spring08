package com.javatechnology.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Category {
	private Long id;
	private String categoryName;
	private Category parentCategory;
	private Set<Category> childCategory=new HashSet<>();
	private Set<Item> items=new HashSet<>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Category getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}
	public Set<Category> getChildCategory() {
		return childCategory;
	}
	public void setChildCategory(Set<Category> childCategory) {
		this.childCategory = childCategory;
	}
	public Set<Item> getItems() {
		return items;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public void addChildCategory(Category category) throws Exception {
		if(category==null)
			throw new Exception("Category can't be empty");
		if(category.getParentCategory()!=null)
			category.getParentCategory().getChildCategory().remove(category);
		category.setParentCategory(this);
		childCategory.add(category);
		
	}
	
	
	

}
