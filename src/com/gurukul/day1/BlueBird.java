package com.gurukul.day1;

import java.util.Scanner;

public class BlueBird {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of people travelling");
		int Ppl = sc.nextInt();
		int Tp= 50*(Math.floorDiv(Ppl, 50));
		System.out.println("the No.of passengers Travelling "+ Tp);
		

	}

}
