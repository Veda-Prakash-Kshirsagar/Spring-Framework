//Dependency injection through constructor using xml configuration
//If we wish we can also create getter methods but it is not necessary

package com.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.beans.Student;
import org.springframework.context.ApplicationContext;
//import com.resources.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String config = "/com/resources/applicationContext.xml";
		ApplicationContext cxt = new ClassPathXmlApplicationContext(config);
		
		Student std = (Student) cxt.getBean("StdId");
		
		std.display();
		
		((ClassPathXmlApplicationContext)cxt).close();

	}

}
