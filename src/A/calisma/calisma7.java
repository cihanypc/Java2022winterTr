package A.calisma;

import java.util.Scanner;

public class calisma7 {
    public static void main(String[] args) {
        /*Kullanicidan maas icin bir teklif isteyin ve
        asagidaki degerlere gore cevap azdirin.
        Teklif 80.000’in uzerinde ise “Kabul ediyorum” ,
        60 – 80.000 arasinda ise “Konusabiliriz”,
        60.000’nin altinda ise “Maalesef Kabul edemem” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen teklifinizi giriniz : ");
        double teklif = scan.nextDouble();

        if (teklif > 80000) {
            System.out.println("kabul edildi");
        } else if (teklif > 60000 && teklif < 80000) {
            System.out.println("konusabiliriz");
        } else {
            System.out.println("malesef kabul edememm");
        }


    }
}
