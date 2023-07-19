package Day2HomeWork;

import java.util.Scanner;

public class AddPolarCoordinates {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius 1");
		int r1 = sc.nextInt();
		System.out.println("Enter the radius 2");
		int r2 = sc.nextInt();
		System.out.println("Enter the angle 1");
		int th1 = sc.nextInt();
		System.out.println("Enter the angle 2");
		int th2 = sc.nextInt();
		double radians1 = Math.toRadians(th1);
		double radians2 = Math.toRadians(th2);
		double X1 = r1*Math.cos(radians1);
		double Y1 = r1*Math.sin(radians1);
		double X2 = r2*Math.cos(radians2);
		double Y2 = r2*Math.sin(radians2);
		double X=X1+X2;
		double Y=Y1+Y2;
		double r= Math.sqrt(X*X+Y*Y);
		System.out.println("r is"+r);
		double th = Math.toDegrees(Math.atan2(Y, X));
		System.out.println("th is"+th);
		
		
		

	}

}
