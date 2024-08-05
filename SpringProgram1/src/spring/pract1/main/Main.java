package spring.pract1.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.pract1.beans.Student;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File path of configuration file
		String config_file = "/spring/pract1/resources/applicationContext.xml";
		
		//Invoking the spring container
		ApplicationContext context =  new ClassPathXmlApplicationContext(config_file);
		
		//Getting the object an type casting it into the Student type
		Student std = (Student) context.getBean("StudId");
		std.display();
		
		((ClassPathXmlApplicationContext)context).close();
		 
		

	}

}
