package com.gurukul.day3;

public class TwoABCPyramid {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++)
				System.out.print((char)(j+64));
			for (int j=1; j<=10-2*i; j++)
				System.out.print(" ");
			for (int j=i; j>=1; j--)
				System.out.print((char)(j+64));
			System.out.println();	
		}
			
			

	}

}
