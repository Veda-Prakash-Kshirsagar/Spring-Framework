package com.main;

import com.beans.*;
//import com.resources.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config = "/com/resources/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(config);
		Student std = (Student) cxt.getBean("student");
		
		std.display();
		
		((ClassPathXmlApplicationContext)cxt).close();

	}

}
