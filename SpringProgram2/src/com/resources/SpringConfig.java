package com.resources;

import com.beans.*;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
//@ComponentScan(basePackages = "com.resources")  can also use this.
public class SpringConfig {
	
	@Bean
	public Student std1() {
		
		Student std = new Student();
		
		std.setName("Veda");
		std.setRollNo(401);
		std.setEmail("Veda@gmail.com");
		
		return std;
		
	}
	

	
}
