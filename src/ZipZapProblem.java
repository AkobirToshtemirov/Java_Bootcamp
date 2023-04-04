public class ZipZapProblem {
    public static void main(String[] args) {
        String res = zipZap("zzzopzop");
        System.out.println(res);
    }

    public static String zipZap(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                sb.append("zp");
                i += 2;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}
