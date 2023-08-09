package com.neebalgurukul.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.exception.IdNotFoundException;
import com.neebalgurukul.model.Student;

public class StudentDAO {

	Connection conn=null;
    Statement stmt = null;
    ResultSet rs = null;
    DataSource ds = new DataSource();
    
    public List<Student> getStudentDetails(){
    	String read = "select * from students";
    	conn = ds.getConnection();
    	List<Student> StudList = new ArrayList <Student>();
    	try {
    		 Statement stmt = conn.createStatement();
    		    ResultSet rs = stmt.executeQuery(read);
    		    if(rs!=null) 
    		    {
    		    	while(rs.next()) 
    		    	{
    		    		Student obj=new Student();
    		    		obj.setName(rs.getString("name"));
    		    		obj.setEmail(rs.getString("email"));
    		    		obj.setCourse(rs.getString("course"));
    		    		obj.setAge(rs.getInt("age"));
    		    		StudList.add(obj);
    		    	}
    		    }
    		    return StudList;
    		}
    	catch(SQLException e) {
    	    System.out.println("SQLException in LoginDAO: "+e.getMessage());
    	    return null;
    	}
    }
    public boolean insertStudent(String name,String email, String course, int age) throws Exception
    {
	String insert = "insert into students (name, email, course, age) values (?,?,?,?)";
	conn = ds.getConnection();
	try {
	    PreparedStatement pstmt = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
	    pstmt.setString(1,name);
	    pstmt.setString(2,email);
	    pstmt.setString(3,course);
	    pstmt.setInt(4,age);
	    int a = pstmt.executeUpdate();
	    
	    if(a!=0)
	    {
		ResultSet rs = pstmt.getGeneratedKeys();
		if(rs.next())
		{
		    int loginId = rs.getInt(a);
		    System.out.println("Inserted new Id = "+loginId);
		}
	    }
	    else
	    {
		throw new Exception("No record inserted");
	    }
	    return true;
	}catch(SQLException e) {
	    System.out.println("SQLException in LoginDAO: "+e.getMessage());
	}
	finally {
	    conn.close();
	}
	return true;
	
    }
    public void deleteStudent(int id) throws SQLException, IdNotFoundException {
		String delete = "delete from students where id=?";
		conn = ds.getConnection();
		try {
		    PreparedStatement pstmt = conn.prepareStatement(delete);
		    pstmt.setInt(1, id);
		    int i = pstmt.executeUpdate();
		    if (i != 0) {
			System.out.println(id + " is deleted.");
		    } else {
			throw new IdNotFoundException(id + " id data not found");
		    }
		} catch (SQLException e) {
		    System.out.println("SQLException: " + e.getMessage());
		} finally {
		    conn.close();
		}
	    }
    public void updateStudentEmail(int id, String email) throws SQLException, IdNotFoundException {
    	String update = "update students set email=? where id=?";
    	conn = ds.getConnection();
    	try {
    	    PreparedStatement pstmt = conn.prepareStatement(update);
    	    pstmt.setString(1, email);
    	    pstmt.setInt(2, id);

    	    int i = pstmt.executeUpdate();
    	    if (i != 0) {
    		System.out.println("Email of " + id + " is changed to " + email);
    	    } else {
    		throw new IdNotFoundException(id + "id data not found");
    	    }
    	} catch (SQLException e) {
    	    System.out.println("SQLException: " + e.getMessage());
    	} finally {
    	    conn.close();
    	}
        }
}
