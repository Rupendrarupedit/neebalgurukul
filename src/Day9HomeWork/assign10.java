package Day9HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assign10 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the IP address");
		String s=sc.nextLine();
		
        String regex= "^[1-9]\\d{0,2}";
        
              String  x[]=s.split("\\.");
              boolean flag=true;
            		  for (int i=0;i<x.length;i++) {
            			  if (Integer.parseInt(x[i])>255)
            				  flag=false;
            			  }
            		  if (x.length!=4)
            			  flag=false;
            		  Pattern p = Pattern.compile(regex);
            		for(int i=0; i<x.length;i++) {
            			Matcher m=p.matcher(x[i]);
            			if (!m.matches()) {
            				
            				flag=false;
                			
            			}
            		}		
            		
            		if (flag) {
            			System.out.println("IP address is Valid");
            		}
            		else
            		System.out.println("IP address is Invalid");
            			  
     }

}
