package day_07;

import java.util.Scanner;

public class c03_tekCifft {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir");
        }

        if (sayi%2!=0){
            System.out.println("girilen sayi tek sayidir");
        }
        /*

         */
    }
}
