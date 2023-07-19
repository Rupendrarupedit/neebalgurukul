package com.gurukul.day2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum=0;
		for (int i=1; i<=num ; i++)
		sum= sum + i;
		System.out.println("the sum of the number is "+ sum );

	}

}
