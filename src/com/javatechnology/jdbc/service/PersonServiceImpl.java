package com.javatechnology.jdbc.service;


import com.javatechnology.jdbc.dao.PersonDao;
import com.javatechnology.jdbc.model.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDao personDao;

	@Override
	public String savePerson(Person person) {
		return personDao.savePerson(person);
		
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	

}
