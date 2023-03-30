package lesson_1;

import java.math.BigDecimal;

public class StoringCurrency {
    public static void main(String[] args) {
        // When working with currency ( money ) use BigDecimal


        // double may cause problems when working with currency
        double value = .012;
        System.out.println("Value: " + value);
        double sum = value + value + value;
        System.out.println("Sum: " + sum);
        double multp = value * 3;
        System.out.println("Multiplication: " + multp);

        // To use BigDecimal in a number, Convert it to String

        String strValue = Double.toString(value);
        System.out.println("strValue: " + strValue);

        // Start BigDecimal

        BigDecimal bigValue = new BigDecimal(strValue);
        System.out.println("BigDecimal strValue: " + bigValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);
        System.out.println("BigDecimal bSum: " + bSum);

        // Change BigDecimal to double

        double sumFinal = bSum.doubleValue();
        System.out.println("bSum changed to double: " + sumFinal);

        // BigDecimal is really important when working with currency


    }
}
