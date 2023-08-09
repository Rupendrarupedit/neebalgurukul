package com.neebalgurukul;

import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.dao.StudentDAO;
import com.neebalgurukul.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentDAO sdao= new StudentDAO();
		System.out.println("Student test");
		List<Student> userList= new ArrayList<>();
		try 
		{
			userList= sdao.getStudentDetails();
			for(Student obj:userList) 
			{
				System.out.println(obj.getName()+" "+obj.getEmail()+" "+obj.getCourse()+" "+obj.getAge());
			}
//			Student a = dao.getOneStudent(2);
//			System.out.println(a);
			
//			dao.insertStudent("abc","abc@gmail.com","python", 23);
//		    dao.deleteStudent(3);
//		    dao.updateStudentEmail(1, "rpd@gmail.com");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
