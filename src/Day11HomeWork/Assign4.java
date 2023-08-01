package Day11HomeWork;

public class Assign4 {

    public static void main(String[] args) {
        String st = "please write in title case";
        String tC = TitleCase(st);
        System.out.println(tC);
    }

    public static String TitleCase(String st) {
        if (st == null || st.isEmpty()) {
            return "";
        }

        char firstChar = Character.toUpperCase(st.charAt(0));
        String remaining = st.substring(1);
        String result = TitleCase(remaining);

        return firstChar + result;
    }
}
