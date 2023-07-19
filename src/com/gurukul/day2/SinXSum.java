package com.gurukul.day2;

import java.util.Scanner;

public class SinXSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of of angle in degrees");
		int degrees = sc.nextInt();
		double x = Math.toRadians(degrees);
		double num= x;
		double s=0;
		double f=1;
		for (double i=1; i<=20; i++) {
			f=f*i;
			if(i%2!=0) {
				s=s+ (x/f);
			num= - num*x*x;
			}
			
			
		}
		System.out.println(s);
		
			

	}

}
