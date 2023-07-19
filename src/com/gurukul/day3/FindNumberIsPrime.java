package com.gurukul.day3;

import java.util.Scanner;

public class FindNumberIsPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		double N = sc.nextDouble();
		boolean isPrime= true;
		for( int i=2; i<=(Math.sqrt(N)); i++)
		{
			if (N%i==0) 
			{
				isPrime= false;
				break;
				
			}
		}
		if(isPrime==true)	
		System.out.println("the no is prime");
		else
			System.out.println("the no is not prime");
			
		
			

	}

}
