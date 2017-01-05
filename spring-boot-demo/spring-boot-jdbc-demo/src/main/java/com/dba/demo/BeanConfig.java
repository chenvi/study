package com.dba.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@EnableTransactionManagement
@PropertySource(value = {"classpath:application.properties"})
public class BeanConfig {
	
	@Autowired
	private Environment env;
	
	public DataSource dataSource(){
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name").trim());
		dataSource.setUrl(env.getProperty("spring.datasource.url").trim());
		dataSource.setName(env.getProperty("spring.datasource.name").trim());
		dataSource.setPassword(env.getProperty("spring.datasource.name").trim());
		return dataSource;
	}
	
	public JdbcTemplate jdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource());
		return jdbcTemplate; 
	}
}
