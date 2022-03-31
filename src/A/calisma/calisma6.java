package A.calisma;

import java.util.Scanner;

public class calisma6 {
    public static void main(String[] args) {

        /* ) Kullanicidan iki sayi isteyin, sayilarin ikisi de
         pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        sayilarin ikisi farkli isaretlere sahipse
        “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
        sayilardan sifira esit olan varsa
        “sifir carpmaya gore yutan elemandir” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("girdiginiz sayilar pozitif ve toplami=" + " " +
                    (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("girdiginiz sayilar negatif ve carpimi=" + " " +
                    (sayi1 * sayi2));
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("farkli isaretlerde islem yapamazsiniz");
        } else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


    }
}
