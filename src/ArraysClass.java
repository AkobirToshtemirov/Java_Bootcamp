import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 54, 12, 4312, 23};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = Arrays.binarySearch(arr, 23);
        System.out.println(key);
        int[] newArrr = Arrays.copyOf(arr, 10);
        Arrays.fill(arr, 33);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArrr));
//        Arrays.sort();
    }
}
