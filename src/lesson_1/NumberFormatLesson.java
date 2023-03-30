package lesson_1;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatLesson {
    public static void main(String[] args) {

        // NumberFormat When working with the currency

        double dval = 1_234_567.89;

        NumberFormat nf = NumberFormat.getNumberInstance();
        System.out.println(nf.format(dval));

        System.out.println("==============");

        NumberFormat intNf = NumberFormat.getIntegerInstance();
        System.out.println(intNf.format(dval));

        System.out.println("==============");

        nf.setGroupingUsed(false); // removes " , " in the num
        System.out.println(nf.format(dval));

        // For particular language in particular country use " Locale "

        Locale locale = new Locale("de", "DE"); // for Germany
        NumberFormat localFormat = NumberFormat.getNumberInstance(locale);
        System.out.println(localFormat.format(dval));

        // Currency Format

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(dval));

        System.out.println(" ");
        Locale localeUz = new Locale("uz", "UZ"); // for Uzbekistan
        NumberFormat currencyFormatUz = NumberFormat.getCurrencyInstance(localeUz);
        System.out.println(currencyFormatUz.format(dval));


    }
}
