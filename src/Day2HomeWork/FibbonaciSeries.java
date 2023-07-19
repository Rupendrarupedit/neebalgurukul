package Day2HomeWork;

public class FibbonaciSeries {

	public static void main(String[] args) {
		int f=0;
		int s=1, t;
		int count=0;
		for (int i=1;; i++) {
			if (f%2==0) {
				if (count>10)
					break;
			System.out.println(f);
			count++;
			}
			t=f+s;
			f=s;
			s=t;
		}

	}

}
