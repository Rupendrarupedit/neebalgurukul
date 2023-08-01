package Day9HomeWork;

import java.util.Scanner;

public class assign16 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Statement");
		String fn=sc.nextLine();
		fn=fn.toUpperCase();
		String x[]=fn.split("[\\W]");
		String ans="";
		for (int i=0; i<x.length; i++)
			ans=ans+x[i];
		
		int l=ans.length();
		boolean flag=true;
		for (int i=0, j=l-1;i<l/2; i++,j--) {
			char c= ans.charAt(i);
			char d= ans.charAt(j);
			if (c!=d) {
				flag= false;
				break;
			}
			
		}
		if (flag == true)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
		
		

	}

}
