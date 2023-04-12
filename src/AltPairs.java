public class AltPairs {
    public static void main(String[] args) {
        String res = altPairs("Chocolate");
        System.out.println(res);
    }

    static String altPairs(String str) {
        StringBuilder sb = new StringBuilder();
        boolean isNext = true;
        int len = str.length();
        for(int i = 0; i < str.length(); i++){
            if(isNext) {
                if(len - i == 1 && len%2 == 1) {
                    sb.append(str.charAt(i));
                    break;
                }
                sb.append(str, i, i + 2);
                isNext = false;
            } else {
                i =  i + 2;
                isNext = true;
            }
        }

        return sb.toString();
    }

}
