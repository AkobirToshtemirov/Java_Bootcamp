public class CodingBat {
    public static void main(String[] args) {
        nearHundred(190);
    }

    public static boolean nearHundred(int n) {
        int absNum1 = Math.abs(100 - n);
        int absNum2 = Math.abs(200 - n);
        System.out.println(absNum1);
        System.out.println(absNum2);
        if(absNum1 <= 10 || absNum2 <=10) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }
        return (absNum1 <= 10 || absNum2 <=2);
    }

}
