package com.gurukul.day2;

import java.util.Scanner;

public class MenuDrivenProgramm {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the shape");
		String shape = sc.nextLine();
		int side;
		int height;
		int width;
		int radius;
		switch(shape)
		{
			case "square":
				Scanner c= new Scanner(System.in);
				System.out.println("Enter the side");
				side = c.nextInt();
				
		System.out.println("the area of square is "+ (side*side));
		break;
		
			case "circle":
				Scanner s= new Scanner(System.in);
				System.out.println("Enter the radius");
				radius = s.nextInt();
				
				System.out.println("the area of circle is "+ (Math.PI*radius*radius));
				break;
				
			case "triangle":
				Scanner tc= new Scanner(System.in);
				System.out.println("Enter the height");
				height = tc.nextInt();
				
				System.out.println("Enter the width");
				width = tc.nextInt();
				
				System.out.println("the area of triangle is "+ (height*width*0.5));
				
		}

	}

}
