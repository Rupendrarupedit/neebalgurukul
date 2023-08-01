package Day9HomeWork;

import java.util.Scanner;

public class assign9 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement");
		String str1= sc.next();
		System.out.println("Enter a string");
		String str2 = sc.next();
		if (str1.length()!= str2.length()) {
			System.out.println("not a rotation of each other");
		}else {
			boolean flag=false;
			for(int i=0;i<str1.length()-1;i++) {
				String result="";
				char t=str1.charAt(str1.length()-1);
				result=result+t;
				for(int j=0;j<str1.length()-1;j++) {
					result=result+str1.charAt(j);
				}
				if (result.equals(str2)) {
					flag=true;
					break;
				}
				str1=result;
			}
			if (flag) {
				System.out.println("the given string are rotation");
			}
			else {
				System.out.println("the given string are not rotation");
			}
		}
		
		
	}

}
