public class WithoutString {
    public static void main(String[] args) {
        String res =  withoutString("THIS is a FISH", "iS");
        System.out.println(res);
    }

    static String withoutString(String base, String remove) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        while (i < base.length()) {
            int idx = base.toLowerCase().indexOf(remove.toLowerCase(), i);
            if (idx == -1) {
                res.append(base.substring(i));
                break;
            } else {
                res.append(base.substring(i, idx));
                i = idx + remove.length();
            }
        }
        return res.toString();
    }

}
