public class HeapSort {

        public static void heapSort(int arr[]) {
            int n = arr.length;

            for (int i = n / 2 - 1; i >= 0; i--) {// Build max heap
                heapify(arr, n, i);
            }

            for (int i = n - 1; i >= 0; i--) { // Heap sort
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, i, 0);// Heapify root element to get highest element at root again
            }
        }

        static void heapify(int arr[], int n, int i) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[left] > arr[largest])
                largest = left;

            if (right < n && arr[right] > arr[largest])
                largest = right;

            // Swap and continue heapifying if root is not largest
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                heapify(arr, n, largest);
            }
        }
        static void showArray(int[] arr)
        {
            for (int value : arr) System.out.print(value + " ");
            System.out.println();
        }

        public static void main(String []args) {
            int[] libraryNum = {124,235,456,123,756,476,285,998,379,108};
            System.out.println("Initial array");
            showArray(libraryNum);
            heapSort(libraryNum);
            System.out.println("Sorted array");
            showArray(libraryNum);
        }
}
