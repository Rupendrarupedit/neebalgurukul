package day5andDay6HomeWork;

import java.util.Scanner;

class Competitionlog{
	private int playerNumber;
	private String completeSets;
	private String incompleteSets;
	private int piecesBuilt;
	static int days;
	static int totalNoOfPieces;
	Competitionlog(){}
	
	public Competitionlog(int playerNumber, String
			completeSets, String incompleteSets, int piecesBuilt) {
		this.playerNumber=playerNumber;
		this.completeSets=completeSets;
		this.incompleteSets=incompleteSets;
		this.piecesBuilt=piecesBuilt;
		
		
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public String getCompleteSets() {
		return completeSets;
	}
	public String getIncompleteSets() {
		return incompleteSets;
	}
	public int getPiecesBuilt() {
		return piecesBuilt;
		
	}
	public void setCompleteSets(String completeSets) {
		
	}
	public void setIncompletesets(String incompleteSets) {
		
	}
	public void setPiecesBuilt(int piecesBuilt) {
		
	}
	public String toString() {
		return "Player "+playerNumber+" completed the following sets: "+completeSets+
				"Player "+playerNumber+" did not completed the following sets: "+incompleteSets+
				"Player "+playerNumber+" built total of "+piecesBuilt+" pieces";

	}
	public String Result(Competitionlog t) {
		String r = "Congratulations to player " + this.playerNumber + "for winning the Lego Set Competition!"+"\n" +
				"Additional information about the competition results is below" + "\n"+
				"Player " + this.playerNumber + " completed the following sets:" + this.completeSets+"\n"+
				"Player " + this.playerNumber + " completed the following sets:" + this.completeSets+"\n"+
				"Player " + this.playerNumber+" built a total of " + this.piecesBuilt +"pieces."+"\n"+
				"Additional information about the competition results is below" + "\n"+
				"Player " + t.playerNumber + " completed the following sets:" + t.completeSets+"\n"+
				"Player " + t.playerNumber + " completed the following sets:" + t.completeSets+"\n"+
				"Player " + t.playerNumber+" built a total of " + t.piecesBuilt +"pieces."+"\n"+
				"The competiton lasted "+ days + "days.";
			return r;
	}
	



}
public class LegoSetCompetiton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of the lego Set 1");
		String A= sc.nextLine();
		System.out.println("Enter the number of the peices for lego Set 1");
		int A1=sc.nextInt();
		System.out.println("Enter the Name of the lego Set 2");
		String B= sc.nextLine();
		System.out.println("Enter the number of the peices for lego Set 2");
		int B1=sc.nextInt();
		System.out.println("Enter the Name of the lego Set 3");
		String C= sc.nextLine();
		System.out.println("Enter the number of the peices for lego Set 2");
		int C1=sc.nextInt();
		Competitionlog.totalNoOfPieces=A1+B1+C1;
		int Day = Competitionlog.days;
		
		
		Competitionlog P1= new Competitionlog(1,"",A+B+C,0);
		Competitionlog P2= new Competitionlog(2,"",A+B+C,0);
		while(P1.getPiecesBuilt()<=Competitionlog.totalNoOfPieces && 
				P2.getPiecesBuilt()<=Competitionlog.totalNoOfPieces) {
			System.out.println("Enter the number of peices Player 1 used for building on day"+Competitionlog.days;);
			int peices1= sc.nextInt();
			System.out.println("Enter the number of peices Player 2 used for building on day+"Competitionlog.days;);
			int peices2= sc.nextInt();
			P1.setPiecesBuilt(P1.getPiecesBuilt()+peices1);
			P2.setPiecesBuilt(P2.getPiecesBuilt()+peices2);
			
			if(P1.getPiecesBuilt()>=Competitionlog.totalNoOfPieces && P2.getPiecesBuilt()>=Competitionlog.totalNoOfPieces ) {
				P1.setPiecesBuilt(0);
				P2.setPiecesBuilt(0);
			}
			if (P1.getPiecesBuilt()>Competitionlog.totalNoOfPieces) {
				
				System.out.println(P1.Result(P2));
			}
			 if
				(P2.getPiecesBuilt()>Competitionlog.totalNoOfPieces) {
				
				System.out.println(P2.Result(P1));
			
			}
			Day++;
		}
		
		
		

	}

}
