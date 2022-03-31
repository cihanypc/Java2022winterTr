package day_15_methodcreation;

import java.util.Scanner;

public class c03_methodcreation {
    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin eger kelime
        // uc harften kisa ise "kelime cok kisa" yazdirin
        // kelime 3.4.5 ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunnsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String kelime = scan.next();
        int harfsayisi = kelime.length();
        if (harfsayisi < 3) {
            System.out.println("Kelime cok kisa");

        } else if (harfsayisi == 3) {
            ucharfitersinecevir(kelime); // method olusturmak icin once method ismi yazlir ve yanina parantez olusturulur
        } else if (harfsayisi == 4) { // uzerine gelerek fare ile tek tiklanarak otomatik method olusturma cikar
            dortharfitersinecevir(kelime); // beraber gitmesi gereken seyler parantez icine yazilir
        } else if (harfsayisi == 5) {
            besharfitersinecevir(kelime);
        } else {
            System.out.println("Kelime cok uzun");
        }


    }

    private static void besharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    private static void dortharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    private static void ucharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);


    }
    /* 1 method ismi yazilir
       2 methoda giderken goturmem gerekn veriable varsa bunu methoada eklemeliyim

     */


}
