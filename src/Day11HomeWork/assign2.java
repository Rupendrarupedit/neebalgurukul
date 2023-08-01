package Day11HomeWork;

class noOfDigits {

	static int digits(int x) {
		int count = 1;
		if (x / 10 == 0)
			return count;
		else {

			return 1 + digits(x / 10);
		}
	}

}

public class assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = noOfDigits.digits(98767);
		System.out.println(a);
	}

}
