import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // trim()
//        String w = "    Hello     ";
//        System.out.println(w);
//        System.out.println(w.trim());

        // replace()
//        String w1 = "hello";
//        System.out.println(w1);
//        String res = w1.replace("h", "H");
//        System.out.println(res);

        // indexOf
//        String w2 = "Hello, World!";
//        int idx = w2.indexOf('l', 4);
//        System.out.println(idx);

        // concat()
//        String s1 = "Hello, ";
//        String s2 = "World!";
//        String res = s1.concat(s2);
//        System.out.println(res);

        // isEmpty()
//        String s1 = "";
//        String s2 = "Hello";
//        String s3 = "  ";
//        System.out.println(s1.isEmpty());
//        System.out.println(s2.isEmpty());
//        System.out.println(s3.isEmpty());
        // checks if str length() 0 or not

        // isBlank()
//        String s1 = "";
//        String s2 = "Hello";
//        String s3 = "  ";
//        System.out.println(s1.isBlank());
//        System.out.println(s2.isBlank());
//        System.out.println(s3.isBlank());
        //On the other hand, isBlank() method was introduced in Java 11, it checks if the string is empty or contains only white space code points (like spaces, tabs, and newlines). If the string contains non-whitespace characters, it returns false.


        // split()
//        String str = "apple,banana,orange";
//        String[] arr = str.split(",");
//        System.out.println(Arrays.toString(arr)); // Output: [apple, banana, orange]

        // code point
//        String str = "hello world";
////        int codePoint = str.codePointAt(1);
////        System.out.println(codePoint); // Output: 101 (the Unicode code point for the letter 'e')
//        str.codePoints().forEach(codePoint -> {
//            System.out.println(codePoint);
//        });

        // Text block

        String html = """
    <html>
        <head>
            <title>My Web Page</title>
        </head>
        <body>
            <p>Welcome to my web page!</p>
        </body>
    </html>
""";
        System.out.println(html);
    }
}
