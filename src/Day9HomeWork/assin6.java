package Day9HomeWork;

import java.util.Scanner;

public class assin6 {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String");
	String x= sc.nextLine();
	System.out.println("enter the oldChar");
	String y= sc.nextLine();
	System.out.println("enter the newChar");
	String z= sc.nextLine();
	String a=x.replace(y,z);
	System.out.println(a);
	
	}
}
