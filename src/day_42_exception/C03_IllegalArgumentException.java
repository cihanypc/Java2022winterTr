package day_42_exception;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        kullanicidan yasini isteyin kullanici yas olarak negatif bir sayi 0, 120 dden buyuk bir sayi girerse
        illegal argument exception olusucak sekilde bir program yaziniz

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("yasinizi giriniz : ");
        int yas = scan.nextInt();

        if (yas <= 0 || yas >= 120) {
            //  System.out.println("gecerli bir yas giriniz");
            throw new IllegalArgumentException();

        } else {
            System.out.println("tesekkurler");
        }


    }
}
