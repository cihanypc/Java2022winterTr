package A.calisma;

import java.util.Locale;
import java.util.Scanner;

public class calisma3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz : ");
        String gunismi = scan.next().toUpperCase(Locale.ROOT);
        if (gunismi.equals("CUMARTESI") || gunismi.equals("PAZAR")){
            System.out.println("girdiginiz gun haftasonu");
        }else {
            System.out.println("Girdiginiz gun hafat ici");
        }

    }
}
