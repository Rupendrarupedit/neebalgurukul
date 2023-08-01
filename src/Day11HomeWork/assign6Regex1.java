package Day11HomeWork;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assign6Regex1 {

	public static void main(String[] args) {
		
		         String test1 = "aeroplane";
				  String test2="bat";
				  String test3="123"
				  
		            
		        ;

		        String regex = "^[aeiouAEIOU].*";

		        Pattern pattern = Pattern.compile(regex);
				Matcher matcher= pattern.matcher(test1);
				Matcher matcher1= pattern.matcher(test2);
				Matcher matcher2= pattern.matcher(test3);
				
				if (matcher.matches())
				{
				System.out.println("String Matches");	
				}
				else
					System.out.println("String does notMatches");
				if (matcher1.matches())
				{
				System.out.println("String Matches");	
				}
				else
					System.out.println("String does notMatches");
				if (matcher2.matches())
				{
				System.out.println("String Matches");	
				}
				else
					System.out.println("String does notMatches");
	}

}
