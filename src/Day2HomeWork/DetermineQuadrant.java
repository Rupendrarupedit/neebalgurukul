package Day2HomeWork;

import java.util.Scanner;

public class DetermineQuadrant {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		System.out.println("Enter the value of y");
		int y = sc.nextInt();
		if(x>0 && y>0)
			System.out.println("the cordinate lies in 1st Qudrant");
		else if (x<0 && y>0)
			System.out.println("the cordinate lies in 2nd Qudrant");
		else if (x<0 && y<0)
			System.out.println("the cordinate lies in 3rd Qudrant");
		else if (x>0 && y>0)
			System.out.println("the cordinate lies in 4th Qudrant");
		else if (x==0 && y!=0)
			System.out.println("the cordinate lies on Y axis");
		else if (x!=0 && y==0)
			System.out.println("the cordinate lies on X axis");
		else
			System.out.println("the cordinate lies on origin");

	}

}
