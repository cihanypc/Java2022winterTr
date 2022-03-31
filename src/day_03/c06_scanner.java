package day_03;

import java.util.Scanner;

public class c06_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz :");
        String isim = scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz :");
        String soyisim = scan.nextLine();

        System.out.println("isim-soyisim : " + isim + "" + soyisim);


    }
}
