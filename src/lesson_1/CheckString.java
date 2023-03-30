package lesson_1;

import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
//        String CheckString String Interpletion

//        stringInterpletion();

        // StringBuilder

//        stringBuilder();

        // practiceStringBuilder

        practiceStringBuilder();

    }

    public static void practiceStringBuilder() {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String input1 = sc.nextLine();

        sb.append(input1);
        System.out.println("Res: " + sb);

    }

    public static void stringBuilder() {
        StringBuffer sb = new StringBuffer("Welcome! ");
        sb.append("to California!");
        String res = sb.toString();
        System.out.println(res);
    }

    public static void stringInterpletion() {
        String myName = "Adham";
        System.out.println(myName);
        myName = "Sobir";
        System.out.println(myName);

        int intValue = 42;

        String getInt = Integer.toString(intValue);
        System.out.println(getInt);

        boolean isTeen = true;
        String teen = Boolean.toString(isTeen);
        System.out.println(teen);

        // %s means Strinf ; %d means numeric value
        // it is called String interpletion

        String showRes = String.format("The size of the shirt: %s, Qty: %d: ", "M", 57);
        System.out.println(showRes);
    }
}
