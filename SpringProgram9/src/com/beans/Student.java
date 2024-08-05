package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	
	@Autowired
	@Qualifier("AddObj2")
	private Address addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("Name: "+name);
		System.out.println("Address: "+addr);
	}
	
	
	

}
