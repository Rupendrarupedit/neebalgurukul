package Day3HomeWork;

public class Assignment2 {

	public static void main(String[] args) {
		int x=1;
		for(int i=1; i<=6; i++) {
			for(int j=6-i; j>=1; j--)
				System.out.print(" ");
			for(int j=i; j>=1; j--) {
				System.out.print(x);
				x++;
				if (x>9)
					x=0;
			}
			System.out.println();
				
			
		}
	}

}
