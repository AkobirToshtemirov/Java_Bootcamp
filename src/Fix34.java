import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 4, 4, 3, 1};
        int[] res = fix34(arr);

        System.out.println(Arrays.toString(res));
    }

    static int[] fix34(int[] nums) {
        int i = 0, j = 0;
        while (i < nums.length && j < nums.length) {
            while (i < nums.length && nums[i] != 3) {
                i++;
            }
            while (j < nums.length && (nums[j] != 4 || (j > 0 && nums[j-1] == 3))) {
                j++;
            }
            if (i < nums.length && j < nums.length) {
                int temp = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        return nums;
    }

}
