package Day1HomeWork;

import java.util.Scanner;

public class BlueBird {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total number of Passengers");
		int Ppl = sc.nextInt();
		int TrB = Ppl/50; //to find the no. of bus required
		int Tp= 50*TrB;
		System.out.println("the No.of passengers actually Travelling "+ Tp);
		

	}

}
