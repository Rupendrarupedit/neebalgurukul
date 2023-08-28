package MemoryGameProject;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

class Cards {
	String face;
	String suit;;

	public Cards(String faces, String suits) {
		super();
		this.face = faces;
		this.suit = suits;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return "Cards [face=" + face + ", suit=" + suit + "]";
	}
	

}

public class MemoryGame {
	static Scanner sc = new Scanner(System.in);
	public static double getPercent(double p, double q) {
		return (double) (p / q) * 100;
	 }

	public static void main(String[] args) {
		System.out.println("Welcome to Memory!\r\n"
				+ "Your goal is to match two cards, using either the same face (i.e. King) or the\r\n"
				+ "same suit (i.e. Clubs).\r\n"
				+ "If you get an exact match, you get 2 points!");
		String faces[]= {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String suits[]= {"Diamond","Heart","Club","Spade"};
		
		
		Cards  card[]=new Cards[10];
		Random rand=new Random();
		for(int i=0;i<card.length;i++) {
			card[i]= new Cards(faces[rand.nextInt(13)], suits[rand.nextInt(4)]);
		}
		int currentScore=0;
		int totalScore=0;
		int correctGuesses=0;
		int totalGuesses=0;
		 outer: do {
			 
				
				System.out.println("How many points do you want to shoot for?");
				int points=sc.nextInt();
				
				System.out.println("The round will end after you get"+points+" points.");
				 while (currentScore < points) {		
					 System.out.println("Pick two cards:\r\n"
							 + "| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
					 
				System.out.println("Select first card (or 'q' to quit this round):");
				int x=sc.nextInt();
				
				System.out.println("First card is: "+card[x].getFace()+" of "+card[x].getSuit());
				
				System.out.println("Select Second card:");
				int y=sc.nextInt();
				
				if(x==y) {
					do {
						System.out.println("Select second card (different from the first card): ");
					y=sc.nextInt();
					}
					while(x==y);
				}
				System.out.println("Second card is: "+card[y].getFace()+" of "+card[y].getSuit());
				
				for(int i=0;i<card.length; i++) {
					if(i==x) {
						System.out.print("|"+card[x]);
					}
					else if (i==y){
						System.out.print("|"+card[y]);
					}
					else {
						System.out.print("|"+i);
					}
				}
				System.out.println();
				if(card[x].getFace()==card[y].getFace() && card[x].getSuit()==card[y].getSuit()) {
					currentScore+=2;
					
					correctGuesses++;
					System.out.println("*** Found an EXACT match!!"+card[x].getFace()+"of"+card[x].getSuit()+ "and"+ card[y].getFace()+"of"+card[y].getSuit() +"***");
					System.out.println("Replacing those with two new cards.");
					System.out.println("Current score is "+currentScore);
					card[x].setFace(faces[rand.nextInt(13)]);
					card[y].setFace(faces[rand.nextInt(13)]);
					card[x].setSuit(suits[rand.nextInt(4)]);
					card[y].setSuit(suits[rand.nextInt(4)]);
					}
				else if
					(card[x].getFace()==card[y].getFace()) {
						currentScore+=1;
						
						correctGuesses++;
						System.out.println("*** Found an EXACT match!!"+card[x].getFace()+"and"+ card[y].getFace()+"***");
						System.out.println("Replacing those with two new cards.");
						System.out.println("Current score is "+currentScore);
						card[x].setFace(faces[rand.nextInt(13)]);
						card[y].setFace(faces[rand.nextInt(13)]);
						card[x].setSuit(suits[rand.nextInt(4)]);
						card[y].setSuit(suits[rand.nextInt(4)]);
						
						}
				else if(card[x].getSuit()==card[y].getSuit()) {
					currentScore+=1;
					
					correctGuesses++;
					System.out.println("*** Found a match!! "+card[x].getSuit()+" and "+ card[y].getSuit() +"***");
					System.out.println("Replacing those with two new cards.");
					System.out.println("Current score is "+currentScore);
					
					card[x].setFace(faces[rand.nextInt(13)]);
					card[y].setFace(faces[rand.nextInt(13)]);
					card[x].setSuit(suits[rand.nextInt(4)]);
					card[y].setSuit(suits[rand.nextInt(4)]);
				}
				else {
					System.out.println("Sorry, no match! :( Try again.");
				}
				
				System.out.println("Current Score is "+currentScore);
				System.out.println();
				totalGuesses++;
		 
				 }
		 System.out.println("Congrats, you won!! Your guess score is "
				    + getPercent((double) correctGuesses, (double) totalGuesses));
			    System.out.println("Wow, that was fun! You want to play again?");
			    char ch = sc.next().charAt(0);
			    if (ch == 'n' || ch == 'N') {
				System.out.println("That was fun, come back if you want practice more!");
				break outer;
			    } else if (!(ch == 'y') && !(ch == 'Y')) {
				System.out.println("Enter a valid input!");
			    }
			    currentScore = 0;
	}
			while(true);

	
	}
	


	
}
