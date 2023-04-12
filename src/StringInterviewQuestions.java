import java.util.StringTokenizer;

public class StringInterviewQuestions {

    public static void main(String[] args) {
        //Q:4 Answer
//        String res = reverseString("this is javatpoint");
//        System.out.println(res);

        //Q:5 Answer
//        boolean res = isPalindrome("jitin");
//        System.out.println(res);

        //Q:5 Answer V2
//        boolean res = isPalindromeV2("nitin");
//        System.out.println(res);

        //Q:6 Answer
//        String res = capStringV1("apple lemon banana cherry");
//        System.out.println(res);

        //Q:7 Answer
//        String res = reverseEachWordV2("this is javatpoint");
//        System.out.println(res);

        //Q:8 Answer
//        String res = toggleEachWordV2("this is javatpoint");
//        System.out.println(res);

        //Q:9 Answer
//        String res = reverseToggle("this is javatpoint");
//        System.out.println(res);

        //Q:27 Answer
//        String res = removeChar("hello", 'l');
//        System.out.println(res);

//    String res = reverseEach("this is javatpoint");
//    System.out.println(res);

        String res = reverseEachV2("this is javatpoint");
        System.out.println(res);

    }

    // Q:4 Solution
    static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));
        return sb.toString();
    }

    //Q:5 Solution V1
    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--)
            sb.append(str.charAt(i));
        return (str.equals(sb.toString()));
    }

    //Q:5 Solution V2
    static boolean isPalindromeV2(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }



    //Q:6 Solution
    static String capitalizeEachWord(String str){
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder(str.length());
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            sb.append(token.substring(0, 1).toUpperCase());
            sb.append(token.substring(1));
            sb.append(" ");
        }

        return sb.toString();
    }

    static String capStringV1(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder(words.length);
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase());
            sb.append(word.substring(1));
            sb.append(" ");
        }

        return sb.toString().trim();
    }


    //Q:6 Solution V2
    static String capStringV2(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean capitalizeNext = true;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                sb.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    //Q:7 Solution
    static String reverseEachWord(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder(words.length);
        for(String word : words) {
            for(int j = word.length() - 1; j >= 0; j--) {
                sb.append(word.charAt(j));
            }
            sb.append(" ");
        }

        return sb.toString();
    }

    //Optimized version
    static String reverseEachWordV2(String str) {
        String[] words = str.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            StringBuilder wordBuilder = new StringBuilder(words[i]);
            words[i] = wordBuilder.reverse().toString();
        }
        return String.join(" ", words);
    }

    //Q:8 Answer
    static String toggleEachWord(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder(words.length);

        for(String word : words) {
            sb.append(word.charAt(0));
            sb.append(word.substring(1).toUpperCase());
            sb.append(" ");
        }

        return sb.toString();
    }

    static String toggleEachWordV2(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        boolean capitalizeNext = false;
        for (char c : str.toCharArray()) {
          if(Character.isWhitespace(c)) {
              sb.append(c);
              capitalizeNext = false;
          } else if(!capitalizeNext) {
              sb.append(c);
              capitalizeNext = true;
          } else {
              sb.append(Character.toUpperCase(c));
          }
        }

        return sb.toString();
    }

    //Q:9 Solution
    static String reverseToggle(String str) {
        String[] words = str.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            words[i] = sb.reverse().toString();
        }

        String res = String.join(" ", words);
        StringBuilder sb = new StringBuilder();

        for(char c : res.toCharArray()) {
            boolean capitalizeNext = false;
            if(Character.isWhitespace(c)) {
                sb.append(c);
                capitalizeNext = false;
            } else if(!capitalizeNext) {
                sb.append(c);
                capitalizeNext = true;
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }

        return sb.toString();
    }

    //Q:27 Solution
    static String removeChar(String str, char c){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) {
                continue;
            }
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    static String reverseEach(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            for(int i = word.length() - 1; i > -1; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    static String reverseEachV2(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return sb.toString().trim();
    }



}

// Q:1
//1) How many objects will be created in the following code?
//String s1="javatpoint";
//String s2="javatpoint";
// Answer :
//Only one. Only one object will be created in String Pool. Next time, it will check weather this String available in String pool or not, if Create String in literal way, I mean with just equal and String.

//Q:2
//2) What is the difference between equals() method and == operator?
//The equals() method matches content of the strings whereas == operator matches object or reference of the strings.

//Q:3
//3) Is String class final?
//Answer: Yes.

//Q:4
//4) How to reverse String in java?
//Input:
//this is javatpoint
//Output:
//tnioptavaj si siht

//Q:5
//5) How to check Palindrome String in java?
//Input:
//nitin
//Output:
//true
//Input:
//jatin
//Output:
//false

//Q:6
// Write a Java Program to capitalize each word in String?
// input
// this is javatpoint
// output
// This Is Javatpoint

//Q:7
// Write a java program to reverse each word in string
//input
//this is javapoint
//output
//sihtsi tnioptavaj

//Q:8
// Write a program to tOGGLE each word in String
//input
// this is javatpoint
//ouput
// tHIS iS jAVATPOINT

//Q: 9
// Write a program reverse tOGGLE each word in string
//input
// this is javatpoint
//output
//sIHT sI tNIOPJAVAJ

//Q:27
// Remove specific character from the String
