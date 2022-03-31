package day_15_methodcreation;

import java.util.Scanner;

public class c02_methodcreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyin eger kelime
        // uc harften kisa ise "kelime cok kisa" yazdirin
        // kelime 3.4.5 ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunnsa "kelime cok uzun" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz : ");
        String kelime = scan.next();
        String terskelime = "";

        if (kelime.length() < 3) {
            System.out.println("Kelime cok kisa");
        } else if (kelime.length() <= 5) {
            if (kelime.length() == 3) {
                terskelime = kelime.substring(2) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);

            } else if (kelime.length() == 4) {
                terskelime = kelime.substring(3) +
                        kelime.substring(2, 3) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);

            } else {
                terskelime = kelime.substring(4) +
                        kelime.substring(3, 4) +
                        kelime.substring(2, 3) +
                        kelime.substring(1, 2) +
                        kelime.substring(0, 1);

            }
            System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
            System.out.println("kelimenin tersten yazilisi : " + terskelime);

        } else {
            System.out.println("Kelime cok uzun");
        }
    }
}
