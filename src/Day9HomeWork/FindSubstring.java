package Day9HomeWork;

public class FindSubstring {

	public static void main(String[] args) {
		String s="hello to all of you";
		String word ="of";
		int i=0;
		int wl= word.length();
		int count=0;
		while (s.indexOf(word, count)!=-1) {
			count=s.indexOf(word, count);
			System.out.println(count+" ");
			count++;
		}
		}
		
	}


