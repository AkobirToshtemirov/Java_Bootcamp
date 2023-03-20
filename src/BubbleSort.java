public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = {22, 3, 4, 32, 44, 5, 7, 100};

        int[] res = bubbleSort.sortArray(nums);
        System.out.println(res);
    }

        public int[] sortArray(int[] nums) {
            boolean isSorted;
            for(int i = 0; i < nums.length; i++){
                isSorted = true;
                for(int j = 1; j < nums.length; j++) {
                    if(nums[j] < nums[j - 1]) {
                        swap(nums, j, j - 1);
                        isSorted = false;
                    }
                }

                if(isSorted) {
                    return nums;
                }
            }
            System.out.println(nums);
            System.out.println("Hello");
            return nums;
        }

        private void swap(int[] array, int index1, int index2) {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
}
