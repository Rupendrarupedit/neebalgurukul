package com.gurukul.day1;

import java.util.Scanner;

public class ReverseOf3Digit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three digit number");
		int n = sc.nextInt();
		int d1 = n%10;
		int d2 = n/10%10;
		int d3 = n/100;
		int re= d1*100+d2*10+d3;
		int sum = n + re;
		int x=7;
		float y= 3;
		double z= x*y/3+y-2/4*3%x;
		int e=7;
		int f=3;
		System.out.println(e+f+" has a sum "+ e+f);
		
		System.out.println("the Sum of number and Reverse is "+sum );
		System.out.println(z);


	}

}

