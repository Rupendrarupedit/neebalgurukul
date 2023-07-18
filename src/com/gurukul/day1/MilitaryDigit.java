package com.gurukul.day1;

import java.util.Scanner;

public class MilitaryDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 4-Digit number System");
		int  D= sc.nextInt();
		
		int TimeHr= (D/100)%12;
		int TimeMin= D%100;
		System.out.println("the Converted time is "+ TimeHr+":"+TimeMin);



	}

}
