package com.gurukul.day1;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Kilometer");
		double km = sc.nextDouble();
		double m= 1000*km;
		double cm= 100*m;
		double inches= cm/2.54;
		double feet= inches/12;
		System.out.println("value in meter is " +m);
		System.out.println("value in Centimeter is " + cm);
		System.out.println("value in feet is " + feet);
		System.out.println("value in inches is " + inches);
	}

}
