package com.dba.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Student> lisStudents() {
		List<Student> students = jdbcTemplate.query("select * from student",new Object[]{},new BeanPropertyRowMapper<Student>(Student.class));
		return students;
	}

}
