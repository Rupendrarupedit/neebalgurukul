package Day9HomeWork;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class assign14 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
/*String regex= "((http|https)://)(www.)?” \r\n"
		+ "+ “[a-zA-Z0-9@:%._\\\\+~#?&//=]{2,256}\\\\.[a-z]” \r\n"
		+ "+ “{2,6}\\\\b([-a-zA-Z0-9@:%._\\\\+~#?&//=]*)";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher= pattern.matcher(url);
		if (!matcher.matches()) {
			System.out.println("enter valid url");
		}
		else {*/
		String x[]=url.split("/|:");
		System.out.println(x[3]);
		
			
		
		

	}

}
