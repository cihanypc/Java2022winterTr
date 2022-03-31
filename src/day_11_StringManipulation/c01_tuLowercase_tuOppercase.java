package day_11_StringManipulation;

import java.util.Locale;

public class c01_tuLowercase_tuOppercase {
    public static void main(String[] args) {

        String str="java Guzeldir";
        // String methodlarini arka arkaya kullanilabilir
        // Mesele ikinci kelimenin ilk harfini kucuk olarak yazdiralim

        // str.charAt(5);
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5));  // g

        System.out.println(str.toUpperCase(Locale.forLanguageTag("tr")));
        // JAVA GUZELDiR
        System.out.println(str.toUpperCase(Locale.forLanguageTag("fr")));



    }
}
