package Day3HomeWork;

import java.util.Scanner;

public class Assigmment8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int Number = sc.nextInt();
		int x=0;
		int sum=0;
		int s;
		while(Number!=0) {
			x=Number%10;
			sum=sum*10 + x;
			Number=Number/10;
		}
		while (sum!=0) {
		
			s=sum%10;
			sum=sum/10;
		
		
		switch (s){
		   case 1:
		    System.out.print(" One ");
		    break;
		  case 2:
		    System.out.print(" Two ");
		    break;
		  case 3:
		    System.out.print(" Three ");
		    break;
		  case 4:
		    System.out.print(" Four ");
		    break;
		  case 5:
		    System.out.print(" Five ");
		    break;
		  case 6:
		    System.out.print(" Six ");
		    break;
		  case 7:
		    System.out.print(" Seven ");
		    break;
		  case 8:
			    System.out.print(" Eight ");
			    break;
		 case 9:
			    System.out.print(" Nine ");
			    break;
		 case 10:
			    System.out.print(" zero ");
			    break;
		}	  
		
		}

	}
}


