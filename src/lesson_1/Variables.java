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

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            System.out.println("=========================");
            while(nums[i] % 2 != 0) {
                System.out.println("Even: " + nums[i]);
            }
            System.out.println("End of the program!");
        }

        for (int element: nums ) {
            System.out.println("Element: " + element);

        }



    }


    public void localVariable() {
        int localNum = 12;
        String localText = "Text";
        System.out.println(age);
        System.out.println(person);

    }


}

//abstract class InterfaceCar {
//
//}
