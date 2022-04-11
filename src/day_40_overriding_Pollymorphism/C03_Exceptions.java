package day_40_overriding_Pollymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
/*
kullanicidan iki sayi alip  bolerek sonucunu yazdiran bir program yaziniz
 */

        Scanner scan = new Scanner(System.in);
        int kontrol = 0;
        while (kontrol != 2) {


            System.out.println("bolmek istediginiz sayiyi yaziniz");
            int sayi1 = scan.nextInt();

            System.out.println("kaca bolmek istediginizi yaziniz");
            int sayi2 = scan.nextInt();
        /*
        sayi2 0 oldugunda sayi1 /0 tanimisz olacagindan java bu durumla karsilasinca  exception verir

        javanin verdigi mesajda exception ne tur bir sorun oldugu neden kaynaklandigi ve hangin satirda
        olusturdugu yazar

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day_40_overriding_Pollymorphism.C03_Exepcitions.main(C03_Exepcitions.java:19)

        bunu cozmek icin sayi2 yi if ile kontrol edebiliriz
         */

            //  if (sayi2==0){
            //      System.out.println("sayi / 0 tanimsizdir. ");
            // }else {

            //  } System.out.println("saonuc = " + sayi1 / sayi2);


            try {
                System.out.println("sonuc = " + sayi1 / sayi2);
            } catch (ArithmeticException e) {
                // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }
            System.out.println("devam etmek icin 1 \nbitirmek icin 2'ye basin");
            kontrol = scan.nextInt();
        }
    }
}

