package com.main;

import java.sql.ResultSet;
import java.sql.SQLException;
//import com.main.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student>
{
	
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Student std = new Student();
		
		std.setStd_name(rs.getString("std_name"));
		std.setStd_roll(rs.getInt("std_roll"));
		std.setAdd(rs.getString("std_add"));
		
		return std;
	}

}
