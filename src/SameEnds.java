public class SameEnds {
    public static void main(String[] args) {
        int[] arr = {5, 6, 45, 99, 13, 5, 6};
        boolean res = sameEnds(arr, 2);
        System.out.println(res);
    }

    static boolean sameEnds(int[] nums, int len) {
        int arrLen = nums.length;
        int count = 0;
        for(int i = 0; i < len; i++) {
            if(nums[i] == nums[arrLen - 1]){
                count++;
                arrLen--;
            }
        }

        return(count%len == 0);
    }
}
