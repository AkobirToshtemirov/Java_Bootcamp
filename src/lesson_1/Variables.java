package lesson_1;

import com.sun.jdi.LocalVariable;

public class Variables {

    int age =19;
    String person = "Student";

    public static void main(String[] args) {

        int a = 10;
        int b = 12;

        if(a == 10 && a < b) {
            System.out.println("Working");
        }

    }


    public void localVariable() {
        int localNum = 12;
        String localText = "Text";
        System.out.println(age);
        System.out.println(person);
    }


}
