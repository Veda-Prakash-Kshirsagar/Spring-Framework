package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Address;
import com.beans.Student;

@Configuration

public class SpringConfig {
	
	@Bean
	public Address AddObj() {
		
		Address add = new Address(40,"ChitaleRoad","ANagar");
		
		return add;
		
	}
	
	@Bean
	public Student StdObj() {
		
		Student std = new Student("Sonak",72,AddObj());
		
		return std;
	}

}
