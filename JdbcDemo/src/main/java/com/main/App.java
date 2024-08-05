package com.main;
//import com.main.SpringCinfig;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	
        ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringCinfig.class);
        
        JdbcTemplate jdbcTemp = cxt.getBean(JdbcTemplate.class);
        
        
        //-------------INSERTION OPERATION---------------------------
        /**
       		String std_name = "Shilpa";
    		int roll_no = 121;
    		String addr = "Anagar";
    	
    		//String std_name = "Riya";
    		//int roll_no = 158;
    		//String addr = "Mumbai";
    	 
	        String insert_query = "INSERT INTO Student VALUES(?,?,?)";
	        int cnt = jdbcTemp.update(insert_query,std_name,roll_no,addr);
	        
	        if(cnt>0) {
	        	System.out.println("Inserted record successfully....");
	        }
	        else {
	        	System.out.println("Faied to insert");
	        }
        
        **/
        
        //-------------UPDATION OPERATION----------------------------
        /**
	        int roll = 101;
	        String address = "Delhi";
	        String update_query = "UPDATE Student SET std_add=? WHERE std_roll=?";
	        int cnt = jdbcTemp.update(update_query,address,roll);
	        
	        if(cnt>0) {
	        	System.out.println("Updated record successfully....");
	        }
	        else {
	        	System.out.println("Faied to update");
	        }
	      **/
        
        //-----------------DELETE OPERATION----------------------------
        /**
	        int roll = 101;
	        
	        String delete_query = "DELETE FROM Student WHERE std_roll=?";
	        int cnt = jdbcTemp.update(delete_query,roll);
	        
	        if(cnt>0) {
	        	System.out.println("Deleted record successfully....");
	        }
	        else {
	        	System.out.println("Faied to delete");
	        }
	     **/
        
        //------------------SELECT OPERATION------------------------------
        
        String select_query = "SELECT * FROM Student";
        List<Student> std_list=jdbcTemp.query(select_query,new StudentRowMapper());
        
        for(Student std : std_list) {
        	
        	System.out.println("Name: "+std.getStd_name());
        	System.out.println("Roll No: "+std.getStd_roll());
        	System.out.println("Address: "+std.getAdd());
        	System.out.println("------------------------------------");
        	
        }
        
        
        
        
        
        ((AnnotationConfigApplicationContext)cxt).close();
    }
}
