package com.javatechnology.jdbc.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.FlushMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.javatechnology.jdbc.model.Person;


@Repository
public class PersonDaoImpl implements PersonDao{
	//private JdbcTemplate jdbcTemplate;
	@Autowired
	//private NamedParameterJdbcTemplate template;
	private HibernateTemplate template;
	//private DataSource dataSource;
	
	private static final String INSERT_PERSON="insert into person(id,name,address) values(?,?,?) ";
	private static final String INSERT_NAMED_PERSON="insert into person(id,name,address) values(:id,:name,:address) ";
	
	
	@Override
	public String savePerson(Person person) {
		Map<String, Object> paramMap=new HashMap<>();
		paramMap.put("id", person.getId());
		paramMap.put("name", person.getName());
		paramMap.put("address", person.getAddress());
		//int update = template.update(INSERT_NAMED_PERSON, paramMap);
		//template.getSessionFactory().openSession().setFlushMode(FlushMode.AUTO);;
		template.save(person);
		return "successfully Inseted";
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
