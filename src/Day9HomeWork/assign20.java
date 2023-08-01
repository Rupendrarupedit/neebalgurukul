package Day9HomeWork;

import java.util.Scanner;

public class assign20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Statement");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		String result="";
		char upper;
		for(int i=0; i<ch.length;i++) {
			upper=ch[i];
			if (i==0)
				upper=Character.toUpperCase(ch[i]);
			if (ch[i]==' ') {
				upper = Character.toUpperCase(ch[i+1]);
				
			if (i!=ch.length-1)
				i++;
			result= result+" ";
			}
			result=result+upper;
		}
	
			System.out.println(result);
	
	}

}
