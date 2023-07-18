package Day1HomeWork;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the No. of units consumed ");
		int  Uts= sc.nextInt();
		System.out.println("Enter the Name of the consumer ");
		String  Name= sc.nextLine();
		double BillAmount;
		
		double	BillAmount100= Uts*4 + .18*(Uts*4);
		double BillAmount300= 400+ (Uts-100)*5;
		double BillAmount300plus = 1400 + (Uts-300)*10;
		System.out.println("Name of the consumer "+ Name);
		if (Uts <=100)
			BillAmount = BillAmount100;
		else if (Uts<=300) {
			if (BillAmount300 <= 1000)
				BillAmount= 400+ (Uts-100)*5+ .18*BillAmount300;
			else
				BillAmount= 400+ (Uts-100)*5+ 0.05*(400+ (Uts-100)*5)+ 0.18*(400+ (Uts-100)*5+ 0.05*(400+ (Uts-100)*5));
		}
		else
			
			BillAmount=1400 + (Uts-300)*10+ .05*(1400 + (Uts-300)*10)+ .18*(1400 + (Uts-300)*10+ .05*(1400 + (Uts-300)*10));
		System.out.println("the bill amount is "+BillAmount);				
			
		
			
			

	}

}
