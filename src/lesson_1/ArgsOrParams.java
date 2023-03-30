package lesson_1;

public class ArgsOrParams {
    public static void main(String[] args) {
        int i = 1;
        for (String s :
                args) {
            System.out.println(i + s);
            i++;

            // Shift + F1 to open the documentation #docs
        }
    }
}
