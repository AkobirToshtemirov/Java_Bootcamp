public class TwoTwo {
    public static void main(String[] args) {
        int[] arr = {2, 2, 7, 2, 1};
        boolean res = twoTwo(arr);
        System.out.println(res);
    }

    static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                boolean prevIsTwo = (i > 0 && nums[i-1] == 2);
                boolean nextIsTwo = (i < nums.length-1 && nums[i+1] == 2);
                if (!prevIsTwo && !nextIsTwo) {
                    return false;
                }
            }
        }
        return true;
    }

}
