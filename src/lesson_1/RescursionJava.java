package lesson_1;

public class RescursionJava {
    public static void main(String[] args) {
        int res = factorialOfNum(5);
        System.out.println(res);
    }

    static int factorialOfNum(int n) {
        int res = 0;
        if(n == 0 || n == 1)
            return 1;
        else{
            res = n * factorialOfNum(n - 1);
            return res;}
    }
}
