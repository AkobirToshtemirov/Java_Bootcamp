package leetcode;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] res = shuffle(arr, 3);
        System.out.println(Arrays.toString(res));
    }

        static int[] shuffle(int[] nums, int n) {
            for(int i = 0; i < n - 1; i++){
                while(i > 0){
                    int temp = nums[i];
                    nums[i] = nums[n];
                    nums[i + 1] = temp;
                    n++;
                    i++;
                }
            }
            return nums;
        }

}
