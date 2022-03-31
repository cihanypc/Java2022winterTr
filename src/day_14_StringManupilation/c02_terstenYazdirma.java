package day_14_StringManupilation;

import java.util.Locale;

public class c02_terstenYazdirma {
    public static void main(String[] args) {
        // kullanicidan 4 harfli bir kelime isteyin
        // ve ilk harfi buyuk digerlerini kucuk olarak
        // girilen kelimeyi tersten yazdirin

        String input = "mavi";

        String tersstr = input.substring(3).toUpperCase() +
                input.substring(2, 3).toLowerCase() +
                input.substring(1, 2).toLowerCase() +
                input.substring(0, 1).toLowerCase();

        System.out.println(tersstr);


    }
}
