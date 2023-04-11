public class NotReplace {
    public static void main(String[] args) {
        String res = notReplace("is test");
        System.out.println(res);
    }

    static String notReplace(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i - 1 >= 0 && Character.isLetter(str.charAt(i - 1))) {
                result.append(str.charAt(i));
                continue;
            }

            if (str.startsWith("is", i)) {
                int end = i + 2;
                if (end == str.length() || !Character.isLetter(str.charAt(end))) {
                    result.append("is not");
                    i += 1;
                    continue;
                }
            }

            result.append(str.charAt(i));
        }

        return result.toString();
    }

}

//https://ielts-house.net/IELTS-Actual-tests-Reading-and-Listening/IELTS-Actual-Test-Reading-and-Listening.pdf