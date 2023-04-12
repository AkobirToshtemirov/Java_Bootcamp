import java.util.Scanner;

public class GuessNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        System.out.println("Playerlar soni: ");
        int playres = sc.nextInt();
        int i = 1;
        while(i <= playres){
            System.out.println("Player " + i);
            corePart(random);
            i++;
        }

    }

    public static void corePart(int random) {
        int i = 1;
        while(i < 4) {
            System.out.println("Urinish: " + i);
            System.out.println("Guess a number between 1 and 100: ");
            int guess = sc.nextInt();
            if(random == guess) {
                setScore(i);
                break;
            }
            if(i == 3){
                System.out.println("You lost!");
                break;
            }
            if(random < guess) System.out.println("This number is greater!");
            else System.out.println("This number is lower!");
            i++;
        }
    }


    public static void setScore(int i) {
        System.out.println("You found! Urinishlar soni: " + i);
        if(i == 1) System.out.println("Score: " + 100);
        if(i == 2) System.out.println("Score: " + 75);
        if(i == 3) System.out.println("Score: " + 50);
    }

}
