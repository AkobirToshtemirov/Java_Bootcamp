package lesson_1;

import java.util.Arrays;

public class ZeroFront {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 0, 1};
//        int[] res = zeroFront(arr);
//        System.out.println(Arrays.toString(res));

        int[] arr = {10, 2, 10};
        int[] res = withoutTen(arr);
        System.out.println(Arrays.toString(res));


    }

    static int[] zeroFront(int[] nums) {
        int zeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[zeroIndex];
                nums[zeroIndex] = 0;
                nums[i] = temp;
                zeroIndex++;
            }
        }
        return nums;
    }

    static int[] withoutTen(int[] nums) {
        int tenIndex = nums.length - 1;

        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 10) {
                int temp = nums[tenIndex];
                nums[i] = temp;
                nums[tenIndex] = 0;
                tenIndex--;
            }
        }

        return nums;
    }


}
