package day_07;

import java.util.Locale;
import java.util.Scanner;

public class c04_haftaiciHaftasonu {
    public static void main(String[] args) {

        //cumartesi veya pazar
        //pazartesi veya sali veya carsamba veya persembe veya cuma

        // string case sensitive dir
        // girilen her kelimenin buyuk kucuk harflerini farkli algilar

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz :");
        String gunismi = scan.next().toLowerCase(Locale.ROOT);
        //kullanici nasil yazarsa yazsin girilen harfleri kucuk harf olarak algilar

        if (gunismi.equals("pazar") || gunismi.equals("cumartesi")) {
            System.out.println("girdiginiz gun haftasonu");
        }
        if (gunismi.equals("pazartesi") || gunismi.equals("sali") || gunismi.equals("carsamba") ||
                gunismi.equals("persembe") || gunismi.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");
        }
    }
    }
