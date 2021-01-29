package com.javatechnology.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javatechnology.jdbc.model.Person;



public class PersonDaoImpl implements PersonDao{
	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_PERSON="insert into person(id,name,address) values(?,?,?) ";

	@Override
	public String savePerson(Person person) {
		jdbcTemplate.update(INSERT_PERSON, person.getId(),person.getName(),person.getAddress());
		return null;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
