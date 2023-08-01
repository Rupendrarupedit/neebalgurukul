package Day11HomeWork;

import java.util.Scanner;
class sumOfElements{
	static int sumElements(int a[], int l){
		if(l==-1)
			return 0;
		else {
			return a[l]+ sumElements(a, l-1);
		}
		
	}
}

public class assign1 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of array");
		int l=sc.nextInt();
		int t=0;
		int a[]=new int[l];
		System.out.println("Enter the elements of array");
		for (int i=0; i<l; i++) {
			a[i]=sc.nextInt();
		}
		 t= sumOfElements.sumElements(a, l-1);
		System.out.println(" the sum of elements in array is "+t);
		
		

	}


	
	}

	
	


