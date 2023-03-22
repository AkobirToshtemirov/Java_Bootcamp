public class BubbleSortExamples {
        static void bubbleSort(int arr[])
        {
            int count = 0;
            boolean needIteration = true;
            while(needIteration) {
                needIteration = false;
                int n = arr.length;
                for(int i = 0; i < n-1; i++)
                    for(int j = 0; j < n-i-1; j++)
                        if(arr[j] > arr[j+1])
                        {
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                            needIteration = true;
                            count++;
                        }
            }
            System.out.println("The number of permutations is " + count);
        }

        static void showArray(int[] arr)
        {
            for(int value : arr) System.out.print(value + " ");
            System.out.println();
        }

        public static void main(String []args) {
            int[] libraryNum = {3,4,5,2,1};
            System.out.println("Initial array");
            showArray(libraryNum);
            bubbleSort(libraryNum);
            System.out.println("Sorted array");
            showArray(libraryNum);
        }
}
