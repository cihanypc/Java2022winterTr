package day_07;

import java.util.Locale;
import java.util.Scanner;

public class c07_haftaningunleri_ifelse_if {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz :");
        String gunismi = scan.next().toLowerCase(Locale.ROOT);

        // hatali girisleri de yazdirmak icin olasiliklari 3 e cikardim
        //haftasonu- haftaici-yanlis giris


        if (gunismi.equals("pazar") || gunismi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");

        } else if (gunismi.equals("pazartesi") || gunismi.equals("sali") ||
                gunismi.equals("carsamba") || gunismi.equals("persembe") ||
                gunismi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");

        } else {
            System.out.println("lutfen gecerli bir gun ismi giriniz");

        }


    }
}
