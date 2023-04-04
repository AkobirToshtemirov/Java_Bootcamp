public class StarOut {
    public static void main(String[] args) {
        StarOut starOut = new StarOut();

        String res = starOut.starOut("sm***eil*ly");
        System.out.println(res);
    }

    public String starOut(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '*') {
                if (i == 0 || str.charAt(i-1) != '*') {
                    result.append(str.charAt(i));
                }
            } else {
                if (i > 0 && str.charAt(i-1) != '*') {
                    result.deleteCharAt(result.length() - 1);
                }
            }
        }

        return result.toString();
    }
}
