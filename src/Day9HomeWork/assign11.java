package Day9HomeWork;

import java.util.Scanner;

public class assign11 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Statement");
		String fn=sc.nextLine();
		char x[]=fn.toCharArray();
		int t=1;
		for (int i=0; i<x.length; i++) {
		if(Character.isUpperCase(fn.charAt(i)))
		t++;}
		System.out.println(t);
		
	}
	

}
