package Day11HomeWork;
public class assign5 {

    static class camelCase {
        static int countUpperCase(String st, int l) {
            if (l < 0) {
                return 0;
            } else {
                if (Character.isUpperCase(st.charAt(l))) {
                    return 1 + countUpperCase(st, l - 1);
                }
            }
            return countUpperCase(st, l - 1);
        }
    }

    public static void main(String[] args) {
        String a = "thisIsACamelCase";
        int length = a.length() - 1;
        int count = camelCase.countUpperCase(a, length);
        System.out.println(count);
    }
}

