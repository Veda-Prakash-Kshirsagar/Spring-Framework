package com.main;

import com.beans.*;
import com.resources.*;
//import org.springframework.context.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student) cxt.getBean("std1");
		//Also we can write
		//Student std = (Student) cxt.getBean(Student.class)
		
		std.display();
		
		((AnnotationConfigApplicationContext)cxt).close();
		
		//Closing the cxt

	}

}
