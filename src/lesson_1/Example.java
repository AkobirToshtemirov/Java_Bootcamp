package lesson_1;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
//        int x = 10;
//        int[] arr = {1, 2, 3};
//
//        // Pass by value
//        System.out.println("Before: " + x);
//        incrementValue(x);
//        System.out.println("After: " + x);
//
//        // Pass by reference
//        System.out.println("Before: " + Arrays.toString(arr));
//        modifyArray(arr);
//        System.out.println("After: " + Arrays.toString(arr));

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 8};

    }

    // Method that takes a parameter by value
    public static void incrementValue(int value) {
        value++;
    }

    // Method that takes a parameter by reference
    public static void modifyArray(int[] array) {
        array[0] = 100;
    }
}
