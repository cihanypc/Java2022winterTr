package day_40_overriding_Pollymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    public static void main(String[] args) {

    /*
    kullanicidan istedigi kadar sayi alip toplayan bir program yaziniz
    toplam 500 u gecerse parogrami bitirsin veya
    kullanici bitirmek istedgiginde q ya basmalidir.
     */

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyiyi giriniz \n" +
                    "bitirmek icin q ya basiniz ");
            //   int toplam = 0;
            try {
                int sayi = scan.nextInt();
                toplam += sayi;
            } catch (InputMismatchException e) {

                String hataligiris = scan.next();
                if (hataligiris.equalsIgnoreCase("q")) {

                    break;

                } else {
                    System.out.println("hatali giris ");
                }

            }


        } while (toplam < 500);
        System.out.println("girdiginiz satilarin toplami : " + toplam);


    }
}
