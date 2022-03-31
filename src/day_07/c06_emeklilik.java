package day_07;

import java.util.Scanner;

public class c06_emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        //65 veya daha buyukse emekli olabilirsin
        // 65 ten kucukse emekli olamazsin yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
        int yas = scan.nextInt();


        if (yas >= 65) {
            System.out.println("emekli olabilirsin");
        } else {
            System.out.println("emekli olamazsin");
            System.out.println(65 - yas + "sene daha calismalisin");
        }

    /* if else stetemen da iki durumdan sadece ve sadece biri calisir
      ikisinin birden calisma ihtimali ===yok
      ikisininde calismama ihitmali ===yok

        */

    }
}
