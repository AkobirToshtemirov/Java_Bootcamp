import java.util.Arrays;

public class StringTokenizerLesson {
    public static void main(String[] args) {
        String word = "apple, orange, banana, lemon, cherry";

        System.out.println(Arrays.toString(word.split(", ")));
    }
}
