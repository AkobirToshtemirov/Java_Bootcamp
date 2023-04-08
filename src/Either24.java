public class Either24 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 2};
        boolean res = either24(arr);
    }

    static boolean either24(int[] nums) {
        boolean hasTwo = false;
        boolean hasFour = false;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i + 1] == 2)
                hasTwo = true;
            if(nums[i] == 4 && nums[i + 1] == 4)
                hasFour = true;
        }

        if(hasTwo && hasFour)
            return false;
        if(hasTwo)
            return true;
        if(hasFour)
            return true;
        return false;
    }
}