package com.gurukul.day1;

import java.util.Scanner;

public class PrintSalary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Salary");
		double Salary = sc.nextDouble();
		if (Salary < 30000)
		 Salary = Salary*1.05 ;
	
			System.out.println("the existing salary is "+ Salary);
	}

}
