package day_05;

import java.util.Scanner;

public class c03_rakamlartoplaminibulma {
    public static void main(String[] args) {

        // kullanicidan aldiginiz dort basamakli sayinin
        // basamaklar degerini bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();


        int rakam = 0;
        int rakamlarToplami = 0;

        /* 1. adim r= rt=0 sayi 7532

         */
        rakam = sayi % 10; // %10 sayinin bolumenden kalani verir
        //2
        rakamlarToplami += rakam; //2
        sayi /= 10; // sayi 753 olur

        //2. adim r=2 rt=2 sayi753

        rakam = sayi % 10; //3
        rakamlarToplami += rakam; //5
        sayi /= 10; //75
        //3.adim r=3 rt=5 sayi 75

        rakam = sayi % 10; //5
        rakamlarToplami += rakam; // 10
        sayi /= 10; //7

        rakam = sayi % 10; //7
        rakamlarToplami += rakam; //17
        sayi /= 10; //0

        System.out.println("girdiginiz sayinin rakamlar toplami :" + rakamlarToplami);


    }
}
