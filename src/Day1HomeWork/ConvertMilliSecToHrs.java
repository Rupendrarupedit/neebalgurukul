package Day1HomeWork;

import java.util.Scanner;

public class ConvertMilliSecToHrs {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the time in Milliseconds");
		int Milli = sc.nextInt();
		int Hr=Milli/(60*60*1000);
		Milli= Milli-(Hr*60*60*1000);
		//System.out.println(Milli);
		int min= Milli/(60*1000);
		Milli= Milli-(min*60*1000);
		//System.out.println(Milli);
		int Sec= Milli/(1000);
		System.out.println("The Time in Hour is"+ Hr+":"+min+":"+Sec);
		
		
	}

}
