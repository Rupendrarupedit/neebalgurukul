package Day2HomeWork;

import java.util.Scanner;

public class ExponentialSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=20;
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		double s=1;
		double f=1;
		for (double i=1; i<n; i++) {
			f=f*i;
			s=s+(Math.pow(x, i)/f);
			};
		System.out.println("the value of exponential series is "+ (s));

	}

}
