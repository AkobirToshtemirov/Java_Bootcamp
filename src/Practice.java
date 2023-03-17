import java.util.Scanner;

public class Practice {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        calcSquare();

//        calcMoney();

//        calcSpeed();

//        calcGipotenuza();

        calcDay();
    }

    // 2

    static void calcSquare() {


        System.out.println("Birinchi tomon: ");
        double a = sc.nextDouble();

        System.out.println("Ikkinchi tomon: ");
        double b = sc.nextDouble();

        double per = (a + b) * 2;
        double surface = a * b;

        System.out.println("Perimetri: " + per);
        System.out.println("Yuzi: " + surface);
    }

//    static void calcSquareA() {
//
//    }

    // 3
    static void calcMoney() {
        System.out.println("Konfet narxi: ");
        double konfet = sc.nextDouble();

        System.out.println("Pechenie narxi: ");
        double pechenie = sc.nextDouble();

        double res1 = konfet * 0.3 + pechenie * 0.4;

        double res2 = konfet * 2 + pechenie * 1.8;

        System.out.println("res1: " + res1 + "sum");
        System.out.println("res2: " + res2 + "sum");

    }

    // 4
    static void calcSpeed() {
        System.out.println("Vaqtni kiriting: ");
        double time = sc.nextDouble();

        System.out.println("Masofani kiriting (km): ");
        double masofa = sc.nextDouble();

        double res = masofa * 1000 / time;

        System.out.println("Speed: " + res);
    }

    // 5

    static void calcGipotenuza() {
        System.out.println("Enter first Katet: ");
        double firstKatet = sc.nextDouble();

        System.out.println("Enter second Katet: ");
        double secondKatet = sc.nextDouble();

        double res = firstKatet * firstKatet + secondKatet * secondKatet;

        double gipotenuza = Math.sqrt(res);
        System.out.println("Gipotenuza: " + gipotenuza);
    }

    // 6

    static void calcDay() {
        System.out.println("Enter the week: ");
        int week = sc.nextInt();

        System.out.println("Enter the month: ");
        int month = sc.nextInt();

        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        int res = week * 7 + month * 30 + year * 365;

        System.out.println("Overall days: " + res);
    }

}
