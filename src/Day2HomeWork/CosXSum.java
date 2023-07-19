package Day2HomeWork;

import java.util.Scanner;

public class CosXSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for degree");
		int degrees = sc.nextInt();
		double x = Math.toRadians(degrees);
		double num= -x*x;
		double s=1;
		double f=1;
		for (double i=1; i<20; i++) {
			f=f*i;
			if(i%2==0) {
				s= s+ (num/f);
			num= - num*x*x;
			}
			
			
		}
		System.out.println(s);
		
		
			

	}
	}
