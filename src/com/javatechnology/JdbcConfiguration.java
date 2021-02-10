package com.javatechnology;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

@Configuration
@ComponentScan(basePackages= {"com.javatechnology.jdbc"})
@PropertySource("classpath:hibernate.properties")
public class JdbcConfiguration {
	@Autowired
	private Environment env;
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("hibernate.connection.driver_class"));
		dataSource.setUrl(env.getRequiredProperty("hibernate.connection.url"));
		dataSource.setUsername(env.getRequiredProperty("hibernate.connection.username"));
		dataSource.setPassword(env.getRequiredProperty("hibernate.connection.password"));
		return dataSource;
	}
	/*@Bean
	public JdbcTemplate getTemplate() {
		JdbcTemplate template=new JdbcTemplate(getDataSource());
		return template;
	}
	@Bean
	public NamedParameterJdbcTemplate getNamedParameterTemplate() {
		NamedParameterJdbcTemplate template=new NamedParameterJdbcTemplate(getDataSource());
		return template;
	}*/
	@Bean
	public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory) {
		HibernateTemplate template=new HibernateTemplate(sessionFactory);
		template.setCheckWriteOperations(false);
		return template;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setHibernateProperties(getHibernateProperties());
		//factory.setPackagesToScan("com.javatechnology.jdbc.model");
		//factory.setAnnotatedPackages("com.javatechnology.jdbc.model");
		factory.setMappingResources(new String [] {"Person.hbm.xml"});
	
		return factory;
	}
	private Properties getHibernateProperties() {
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.connection.hbm2ddl.auto", env.getRequiredProperty("hibernate.connection.hbm2ddl.auto"));
		hibernateProperties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
		hibernateProperties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.connection.show_sql"));
		hibernateProperties.put("hibernate.default_schema", env.getRequiredProperty("hibernate.default_schema"));
		return hibernateProperties;
	}
	@Bean
	public HibernateTransactionManager getManager(SessionFactory sessionFactory) {
		HibernateTransactionManager manager=new HibernateTransactionManager();
		//manager.setDataSource(getDataSource());
		manager.setSessionFactory(sessionFactory);
		
		return manager;
	}
}
