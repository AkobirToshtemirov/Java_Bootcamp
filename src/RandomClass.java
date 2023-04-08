import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(101);
        System.out.println(randomNumber);
        double doubleRandom = random.nextDouble(101);
        System.out.println(doubleRandom);

    }

    public int[] fizzArray(int n) {
        if(n == 0) {
            int[] arr = new int[0];
            return arr;
        }

        int[] newArr = new int[5];
        return newArr;
    }

}
