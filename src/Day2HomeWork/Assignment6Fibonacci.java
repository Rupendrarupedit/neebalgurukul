package Day2HomeWork;

import java.util.Scanner;

public class Assignment6Fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of lower bound");
		int lowerBound = sc.nextInt();
		System.out.println("Enter the value of upper bound");
		int upperBound = sc.nextInt();
		int f=0;
		int s=1, t;
		
		for (int i=1;i<=300; i++) {
			if (f>=lowerBound && f<=upperBound)
			System.out.println(f);
		
			t=f+s;
			f=s;
			s=t;
			if (f > upperBound)
				break;
			}
		
		
		}

	}
