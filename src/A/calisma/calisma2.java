package A.calisma;

import java.util.Locale;
import java.util.Scanner;

public class calisma2 {
    public static void main(String[] args) {

        /* kullanicidan bir gun alin eger gun “Cuma” ise
        ekrana “Muslumanlar icin kutsal gun” yazdirin.
         “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
         “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin */
        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen gun ismi giriniz : ");
        String gunIsmi= scan.next().toLowerCase(Locale.ROOT);

        if (gunIsmi.equals("cuma")) {
            System.out.println("Muslumanlar ivin kutsal gun");

        }else if (gunIsmi.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");

        }else if (gunIsmi.equals("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }else {
            System.out.println("farkli bir gun giriniz");

        }
        // burda girilen degerler String oldugu icin == yerine equals kullanilmistir.
    }
}
