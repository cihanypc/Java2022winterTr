package day_11_StringManipulation;

import java.util.Scanner;

public class c03_equalsIgnoreCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip katilmak istemedigini sorun
        // evet derse derse Derse ktiliminiz alinmistir. alinmistir
        //hayir derse cevabiniz Sonraki derslere bekleriz yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \n Evet veya Hayir yaziniz");
        String Cevap = scan.next();

        if (Cevap.equalsIgnoreCase("Evet")) {
            System.out.println("Cevabiniz : " + Cevap + " derse katiliminiz alinmistir");

        } else if (Cevap.equalsIgnoreCase("Hayir")) {
            System.out.println("Cevabiniz : " + Cevap + " Sonraki derslere bekleriz");

        } else {
            System.out.println("lutfen evet veya hayir yaziniz");


        }


    }
}
