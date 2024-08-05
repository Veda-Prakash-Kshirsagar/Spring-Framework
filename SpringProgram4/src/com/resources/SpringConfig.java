package com.resources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Bean;
//import com.beans.*;

@Configuration
@ComponentScan("com.beans")    //OR we can use @ComponentScan({"com.beans"}) OR @ComponentScan(basePackages = {"com.beans"})
public class SpringConfig {
	
	//No need to specify here anything this file ony tells the container which class or bean has to be scanned
	

}
