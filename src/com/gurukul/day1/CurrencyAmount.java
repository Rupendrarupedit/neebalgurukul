package com.gurukul.day1;

import java.util.Scanner;

public class CurrencyAmount {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the three digit number");
		int n = sc.nextInt();
		int twothousand= n/2000;
		n = n%2000;
		int fivehundred= n/500;
		n= n%500;
		int twohundred= n/200;
		n= n%200;
		int onehundred= n/100;
		n= n%100;
		int fifty=n/50;
		n= n%50;
		int twenty= n/20;
		n= n%20;
		int ten= n/10;
		n= n%10;
		int five= n/5;
		n= n%5;
		System.out.println( twothousand  + "*2000= "+ 2000*twothousand);
		System.out.println(fivehundred+"*500= " + 500*fivehundred);
		System.out.println(twohundred + "*200= " + 200*twohundred);
		System.out.println(onehundred+ "*100= " + 100*onehundred);
		System.out.println(fifty+"*50= "+50*fifty);
		System.out.println(twenty+"*20= "+20*twenty);
		System.out.println(ten+"*10= "+10*ten);
		System.out.println(five+"*5= "+5*five);
		
	}

}
