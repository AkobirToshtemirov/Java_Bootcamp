public class Sum13 {
    public static void main(String[] args) {
        Sum13 sum13 =  new Sum13();
        int[] arr = {1, 2, 2, 1};
        int res = sum13.sum13(arr);
        System.out.println(res);
    }

    public int sum13(int[] nums) {
        if(nums.length == 0)
            return 0;

        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            if(nums[i] != 13)
                if(i == 0 || nums[i - 1] != 13)
                    sum += nums[i];

        return sum;
    }

}
