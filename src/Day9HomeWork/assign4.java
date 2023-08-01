package Day9HomeWork;

import java.util.Scanner;

public class assign4 {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Statement");
		String fn=sc.nextLine();
	
		char x[]=fn.toCharArray();
		int count=0;
		for(int i=0; i<=x.length-1; i++) {
		if (x[i]=='(')
			count++;
		else if
			(x[i]==')');
			count--;
		if 
				(x[i]<0)
			break;
		}
		if (count==0) {
			System.out.println("Paranthesis are balanced");
			}
		else
			System.out.println("Paranthesis are not balanced");
		
	}

}
