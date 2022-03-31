package day_08_ifElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class c04_emeklilik {
    public static void main(String[] args) {
        /* eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir
        calisan erkekse 65 yasindan buyukse emekli olabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi yaziniz " +
                " \n Kadin icin K \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase(Locale.ROOT).charAt(0);

        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini konntrol ediniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin \n daha" + (60 - yas) + "calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cinsiyet == 'E') {

            if (yas < 0 || yas > 120) {
                System.out.println("lutfen girdiginiz yas degerini konntrol ediniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsin \n daha : " + (60 - yas) + "calisman gerekir");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("lutfen cinsiyet icin gecerli bir harf giriniz");

        }
    }

}
