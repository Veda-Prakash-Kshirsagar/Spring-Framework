//Using annotations with xml configuration 
package com.beans;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

//USing @Component here will tell container that we have to create the object of this class
//The name of the object created will be "student" lower case 's'
//This object will be passed as parameter to getBean("student") in main class
//@ComponentScan(basePackages = "com.beans") can also be used.

@Component

public class Student {
	
	@Value("Riya")
	private String name;
	@Value("56")
	private int rollNo;
	@Value("Riya174@gmail.com")
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void display() {
		
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("Email: "+email);
	}

}
