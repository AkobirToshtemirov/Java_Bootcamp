package lesson_1;

public class StringValues {
    public static void main(String[] args) {
        stringMethods();
    }

    static void stringMethods() {
        String s1 = "Welcome to Uzbekistan!";

        int index = s1.indexOf("Uzbekistan");
        System.out.println(index);

        String country = s1.substring(11);
        System.out.println(country);

        // Trim which removes (probel button spaces) white spaces at beginning and at the end of the String

        String w = "    Welcome!     ";
        System.out.println(w);

        String trimmed  = w.trim();
        System.out.println(trimmed);

        String s = "34.452";

        System.out.println(s);
        Double d = Double.parseDouble(s);
        System.out.println(d);

        // Wrappe class => Double.parseDouble(s);

        double dW = Double.parseDouble(s);
        System.out.println(dW);

        for (int i = 0; i < s.length(); i++) {

        }
    }
}
