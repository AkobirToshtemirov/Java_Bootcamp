public class IsEverywhere {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3};
        boolean res = isEverywhere(arr, 1);
    }

    static boolean isEverywhere(int[] nums, int val) {
        boolean res = false;
        int len = nums.length - 1;

        if(nums.length < 2)
            return true;

        for(int i = 0; i < len; i++) {
            if(nums[i] == val || nums[i + 1] == val)
                res = true;
            else {
                res = false;
                break;
            }
        }
        return res;
    }

}
