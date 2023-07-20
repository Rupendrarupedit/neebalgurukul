package Day3HomeWork;

import java.util.Scanner;

public class Assignment_6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		double N = sc.nextDouble();
		int f=0;
		int s=1, t;
		int count=0;
		for (int i=1;; i++) {
			t=f+s;
			f=s;
			s=t;
			count++;
			if (f>N)
				System.out.println(f);
			//count++;
			if (count>(2*N-1))
			break;
			}
			
		}

	

	}


