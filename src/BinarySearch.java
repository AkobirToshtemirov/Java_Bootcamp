import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("We have numbers from 1 to 10. Which num do you want to find?");
        System.out.print("Enter the Number: ");
        int target = sc.nextInt();

        int res = binarySearch(numArr, numArr.length, target);
        System.out.println(res);
    }

    static int binarySearch(int [] arr, int arrLength, int target){
        int low, high, mid;

        low = 0;
        high = arrLength - 1;
         while(low <= high) {
             mid = (low + high) / 2;
             if(target < arr[mid]) {
                 high = mid - 1;
             } else if(target > arr[mid]) {
                 low = mid + 1;
             } else {
                 System.out.println("Num is: " + mid);
                 return mid;
             }
         }

        System.out.println("Could not find!");
         return -1;
    }
}
