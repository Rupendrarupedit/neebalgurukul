package Day9HomeWork;

import java.util.Scanner;

public class assign13permutation {
	public static  void shift(char a[], int i, int t) {
		char temp=a[i];
		
		a[i]=a[t];
		a[t]=temp;
	}
	public static void permutate(char a[], int t) {
		if (t==a.length-1) {
			System.out.println(a);
			return;
		}
		for (int i=0; i<a.length;i++) {
			shift( a,  i,  t);
			permutate(a, t+1);
			shift( a,  i,  t);
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" provide the input");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		permutate(ch, 0);
		
	}

}
