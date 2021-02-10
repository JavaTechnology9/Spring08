package com.javatechnology.jdbc.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechnology.jdbc.dao.PersonDao;
import com.javatechnology.jdbc.model.Person;
@Service("personService")
//@Transactional
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonDao personDao;

	@Override
	//@Transactional
	public String savePerson(Person person) {
		return personDao.savePerson(person);
		
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	

}
