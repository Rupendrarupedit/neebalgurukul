package com.gurukul.day1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side");
		double s = sc.nextDouble();
		double a= (Math.sqrt(3)/4)*(Math.pow(s, 2));
		System.out.print("the are of triangle is "+a);
		System.out.print("My name is Rupendra ");
		

	}

}

