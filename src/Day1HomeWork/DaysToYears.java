package Day1HomeWork;

import java.util.Scanner;

public class DaysToYears {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of days");
		int days = sc.nextInt();
		int Years, months, weeks, Days;
		
		Years= days/365;
		months= (days%365)/30;
		
		days = days-(365*Years+30*months);
		
		weeks= days/7;
		Days= days%7;
		System.out.println("days in year: months: weeks: days are" + Years+":"+ months+":"+ weeks+":"+Days);
		System.out.print("cde" + days);
	}

}
