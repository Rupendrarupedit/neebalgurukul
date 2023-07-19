package com.gurukul.day2;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the number");
		//int num = sc.nextInt();
		double sum=0;
		double f=1;
		double n=1.0;
		
		for (double i=1; i<=20; i++) {
			f=f*i;
		if	(i%2!=0) {
		sum = sum +(n/f);
		n=-n;
		}
		}
		
		System.out.println(sum);
	}

}
