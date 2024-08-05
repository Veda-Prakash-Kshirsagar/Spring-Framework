package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.beans.Address;
import com.beans.Student;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address AddObj() {
		
		Address addr = new Address();
		
		addr.setStreet("Suncity Road");
		addr.setPin(411051);
		addr.setState("Delhi");
		
		return addr;
	}
	
	@Bean
	public Student StdObj() {
		
		Student std = new Student();
		
		std.setName("Riya");
		std.setAddress(AddObj());
		
		return std;
	}
	
}
