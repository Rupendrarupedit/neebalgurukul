package com.gurukul.day1;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 3 digit number");
		int  A= sc.nextInt();
		int d3=A%10;
		int d2=A/10%10;
		int d1= A/100;
		if (A == Math.pow(d1, 3)+Math.pow(d2, 3)+Math.pow(d3, 3))
		
	System.out.println("the entered no. is Armstong number");
		else
			System.out.println("the entered no. is not an Armstong number");
			
	}

}
