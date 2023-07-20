package Day3HomeWork;

import java.util.Scanner;

public class Assigment_5 {

	public static void main(String[] args) {
		for (int i=1; i<=1000 ; i++) {
			int N=i;
			int a=N;
			int b=N;
			double s=0;
			int c=0;
			int x;
			while (a!=0) {
				c++;
				a=a/10;
				}
			while (b!=0) {
				x=b%10;
				s= s+ Math.pow(x, c);
				b=b/10;
			}
			if (s==N)
				System.out.println(N);
			
			
		}
			
		
	}
	
}



