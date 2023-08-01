package Day9HomeWork;

import java.util.Scanner;

public class assin15 {

	public static void main(String[] args) {
		
		
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Statement");
			String fn=sc.nextLine();
			String s[]= fn.split(" ");
			String t="";
			for (int i=s.length-1;i>=0;i--) {
				
				t=t+s[i]+" ";
				}
			System.out.println("Enter the Statement");
}
	}
