package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Student StdId() {
		
		Student std = new Student();
		
		std.setName("Munnni");
		
		return std;
		
	}
	
	@Bean
	public Address AddObj2() {
		
		Address add = new Address();
		
		add.setHsNo(222);
		add.setSt("HP");
		add.setCnt("America");
		
		return add;
		
	}
	
	@Bean
	public Address AddObj() {
		
		Address add = new Address();
		
		add.setHsNo(101);
		add.setSt("MP");
		add.setCnt("India");
		
		return add;
		
	}
	
	

}
