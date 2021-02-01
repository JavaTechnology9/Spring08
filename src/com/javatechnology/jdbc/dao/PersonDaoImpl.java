package com.javatechnology.jdbc.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.javatechnology.jdbc.model.Person;



public class PersonDaoImpl implements PersonDao{
	//private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate template;
	private DataSource dataSource;
	
	private static final String INSERT_PERSON="insert into person(id,name,address) values(?,?,?) ";
	private static final String INSERT_NAMED_PERSON="insert into person(id,name,address) values(:id,:name,:address) ";
	
	public void setDataSource(DataSource dataSource) {
		template=new NamedParameterJdbcTemplate(dataSource);
	}
	@Override
	public String savePerson(Person person) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id", person.getId());
		paramMap.put("name", person.getName());
		paramMap.put("address", person.getAddress());
		int update = template.update(INSERT_NAMED_PERSON, paramMap);
		return update>0?"successfully Inseted":"we may get Exception";
	}

	/*@Override
	public String savePerson(Person person) {
		jdbcTemplate.update(INSERT_PERSON, person.getId(),person.getName(),person.getAddress());
		return null;
	}

	public void setjdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	

}
