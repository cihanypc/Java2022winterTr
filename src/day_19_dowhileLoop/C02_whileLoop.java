package day_19_dowhileLoop;

public class C02_whileLoop {
    public static void main(String[] args) {

        /* kullanicidan bir sayi alin ve
        bu sayinin rakamlari toplamini yazdirin
         */

        int input = 1212;
        int rakam = 0;
        int rakamlartoplami = 0;

        while (input > 0) {
            rakam = input % 10;
            rakamlartoplami += rakam;
            input /= 10;
        } // print komutu while dongusunun disina yazilir
        System.out.println(rakamlartoplami);

    }
}
