package day_07;

import java.util.Locale;
import java.util.Scanner;

public class c05_ifelseHaftaningunleri {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz :");
        String gunismi= scan.next().toUpperCase(Locale.ROOT);

        if (gunismi.equals("PAZAR") || gunismi.equals("CUMARTESI")) {
            System.out.println("girdiginiz gun haftasonu");
        }else {
            System.out.println("girdiginiz gun haftaici");
        }


    }
}
