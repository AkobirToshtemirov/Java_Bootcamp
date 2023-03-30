package lesson_1;

import java.text.NumberFormat;

public class NumberFormatLesson {
    public static void main(String[] args) {

        // NumberFormat When working with the currency

        double dval = 1_234_567.89;

        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println(nf.format(dval));

        System.out.println("==============");

        NumberFormat intNf = NumberFormat.getIntegerInstance();
        System.out.println(intNf.format(dval));
    }
}
