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

			
//			sdao.insertStudent("abc","abc@gmail.com","python", 23);
//			System.out.println("New student inserted");
//		    sdao.deleteStudent(3);
//			System.out.println(" student deleted");
//		    sdao.updateStudentEmail(1, "rpd@gmail.com");
//			System.out.println(" student details updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
