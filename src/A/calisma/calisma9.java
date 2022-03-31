package A.calisma;

import java.util.Scanner;

public class calisma9 {
    public static void main(String[] args) {
        /*Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
        girilen degerlere gore dikdorgenin kare olup olmadigini yazdirin.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kenar uzunluklarini giriniz");
        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();


        if (kenar1 == kenar2) {
            System.out.println("bu bir karedir");
        } else {
            System.out.println("bu bir dikdortgendir");
        }

    }
}
