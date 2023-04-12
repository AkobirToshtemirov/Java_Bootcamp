package leetcode;

import java.util.Arrays;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] arr = {10,4,8,3};

        int[] res = leftRigthDifference(arr);
        System.out.println(Arrays.toString(res));
    }

    static int[] leftRigthDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int sum = 0;
        leftSum[0] = 0;
        for(int i = n - 1; i > 0; i--) {
            for(int j = i - 1; j > - 1; j--) {
                sum += nums[j];
            }
            leftSum[i] = sum;
            sum = 0;
        }

        int[] rightSum = new int[n];
        rightSum[n-1] = 0;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                sum += nums[j];
            }
            rightSum[i] = sum;
            sum = 0;
        }

        for(int i = 0; i < n; i++) {
            nums[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return nums;
    }
}
