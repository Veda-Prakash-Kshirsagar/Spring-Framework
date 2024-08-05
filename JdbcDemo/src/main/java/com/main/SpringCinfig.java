package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringCinfig {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource dsource = new DriverManagerDataSource();
		
		dsource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dsource.setUrl("jdbc:mysql://localhost:3306/Spring_jdbc");
		dsource.setUsername("root");
		dsource.setPassword("VS@06Feb");
		
		
		return dsource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemp() {
		
		JdbcTemplate jdbcTemp = new JdbcTemplate();
		
		jdbcTemp.setDataSource(myDataSource());
		
		return jdbcTemp;
		
	}
	

}
