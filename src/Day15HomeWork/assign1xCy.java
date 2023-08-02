package Day15HomeWork;

import java.util.Scanner;
import java.util.Stack;

public class assign1xCy {

    static boolean xCy(String s) {
        int len = s.length();
        int i = 0;

        
        while (i < len && s.charAt(i) != 'C') {
            i++;
        }

        
        if (i < len - 1 && i > 0) {
            String x = s.substring(0, i);
            String y = s.substring(i + 1);

            
            if (!x.isEmpty() && !y.isEmpty()) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (xCy(s)==true) {
            System.out.println("The string is in xCy format");
        } else {
            System.out.println("The string is not in xCy format");
        }
    }
}
