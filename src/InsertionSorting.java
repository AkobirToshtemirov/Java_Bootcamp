public class InsertionSorting {
        static void insertionSort(int arr[])
        {
            int count=0;
            int n = arr.length;
            for(int i = 1; i < n; i++) {
                int keyItem = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j] > keyItem) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                    count++;
                }
                arr[j + 1] = keyItem;
            }
            System.out.println("The number of permutations is " + count);
        }

        static void showArray(int[] arr)
        {
            for(int value : arr) System.out.print(value + " ");
            System.out.println();
        }

        public static void main(String []args) {
            int[] libraryNum = {124,235,456,123,756,476,285,998,379,108};
            System.out.println("Initial array");
            showArray(libraryNum);
            insertionSort(libraryNum);
            System.out.println("Sorted array");
            showArray(libraryNum);
        }
}
