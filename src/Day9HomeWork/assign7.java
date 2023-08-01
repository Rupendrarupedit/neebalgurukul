package Day9HomeWork;

import java.util.Scanner;

public class assign7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Statement");
		String fn=sc.nextLine();
		String b= "";
		String z="";
	
		for (int i=0; i<fn.length();i++) {
			char a= fn.charAt(i);
			a=(char) (a+3);
			b=b+a;
			
		}
		System.out.println(b);
		for (int i=0; i<=b.length()-1;i++) {
			char d= b.charAt(i);
			d=(char) (d-3);
			z=z+d;
			
		}
		System.out.println("the deciphred string is "+ z);
		
		
		
		
		



	}

}
