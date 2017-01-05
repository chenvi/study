package com.dba.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/student",method = RequestMethod.GET)
	public Map<String, Object> listAll(){
		List<Student> list = this.studentService.listAllStudents();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", list.size());
		return map;
	}
	
	@RequestMapping(value="/student1",method = RequestMethod.GET)
	public List<Student> listAll1(){
		List<Student> list = this.studentService.listAllStudents();
		return list;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(StudentController.class,args);
	}
}
