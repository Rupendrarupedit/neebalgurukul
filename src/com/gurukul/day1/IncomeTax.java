package com.gurukul.day1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Salary");
		double Sal = sc.nextDouble();
		double It;
		if (Sal>1500000)
			It= 0.3*Sal;
		else if (Sal>1000000)
			
			It= 0.15*Sal;
		else if (Sal >750000)
			It= 0.1* Sal;
		else It= 0;
		System.out.println("the Salary is "+ Sal);
		System.out.println("the tax amount is "+ It);
		System.out.println("the take Over is "+ (Sal-It));
		
	}
	

}
