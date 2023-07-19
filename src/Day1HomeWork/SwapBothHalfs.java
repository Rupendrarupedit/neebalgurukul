package Day1HomeWork;

import java.util.Scanner;

public class SwapBothHalfs {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the four digit number");
		int num = sc.nextInt();
		int d4= num%10;
		int d3= num%100/10;
		int d2= num%1000/100;
		int d1= num/1000;
		int Swap= d3*1000 + d4*100 + d1*10 + d2*1;
		System.out.println("the Swaped number is " + Swap);
	}

}
