package com.gurukul.day2;

import java.util.Scanner;

public class PolarToCartisian {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of radius");
		int r = sc.nextInt();
		System.out.println("Enter the value of of angle in degrees");
		int degrees = sc.nextInt();
		double radians = Math.toRadians(degrees);
		double X = r*Math.cos(radians);
		double Y = r*Math.sin(radians);
		System.out.println("the cartisian coordinates are "+ (X+","+Y));
		
	}

}
