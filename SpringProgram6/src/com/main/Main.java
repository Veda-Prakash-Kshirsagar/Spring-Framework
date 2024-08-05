//DI setter method using java Configuration

package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.resources.*;
import com.beans.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Student std = (Student) cxt.getBean("StdObj");  //or Student std = (Student) cxt.getBean(Student.class);
		
		std.display();
		((AnnotationConfigApplicationContext)cxt).close();

	}

}
