package Day9HomeWork;

import java.util.Scanner;

public class assign12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String st=sc.nextLine();
		System.out.println("Enter the character to be searched");
		char search=sc.next().charAt(0);
		int count=0;
		for (int i=0; i<st.length();i++) {
			if (st.charAt(i)==search)
				count++;
//			System.out.println("the count of "+search+" is "+count);
		}
		System.out.println("the count of "+search+" is "+count );
		}


}
