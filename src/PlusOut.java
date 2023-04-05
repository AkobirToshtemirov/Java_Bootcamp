import javax.management.loading.PrivateMLet;

public class PlusOut {
    public static void main(String[] args) {
        PlusOut plusOut =  new PlusOut();
        String res = plusOut.plusOut("12xy34xyabcxy", "xy");
    }

    public String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            if (str.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

}
