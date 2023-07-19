package Day1HomeWork;

import java.util.Scanner;

public class divideTwoNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the x");
		System.out.println("Enter the y");
		
		int x = sc.nextInt();
		int y= sc.nextInt();
		int z;
		if (x>y)
			z= x/y;
		else 
			z= y/x;
		System.out.println("the result is "+ z);
	}

}
