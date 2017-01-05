package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@SpringBootApplication
public class SpringDemoApplication {
	
	/*@RequestMapping("/")
	String home(){
		return "hello";
	}*/
	
	public static void main1(String[] args) {
		System.out.println("test");
		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
