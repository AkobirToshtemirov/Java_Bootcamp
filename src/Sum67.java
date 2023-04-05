public class Sum67 {
    public static void main(String[] args) {
        Sum67 sum67 = new Sum67();
        int[] arr = {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7};
        int res = sum67.sum67(arr);

        System.out.println(res);
    }

    public int sum67(int[] nums) {
        int total = 0;
        boolean inSection = false;
        for (int num : nums) {
            if (num == 6 && !inSection) {
                inSection = true;
            } else if (num == 7 && inSection) {
                inSection = false;
            } else if (!inSection) {
                total += num;
            }
        }
        return total;
    }

}
