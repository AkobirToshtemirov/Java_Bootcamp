public class StringInterviewQuestions {

    public static void main(String[] args) {
    //Q:4 Answer
//        String res = reverseString("this is javatpoint");
//        System.out.println(res);
    }

    // Q:4 Solution
    static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
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
