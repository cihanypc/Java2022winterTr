package day_11_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class c04_lenght {
    public static void main(String[] args) {

        // kullanicidan ismini alip basharfini ve son harfini buyulk harflerle yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" lutfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.println("ilkharf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf : "+isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str2=null;
        System.out.println(str2);
        //System.out.println(str2.length());// calistirildiginda hata verir

        String str3;
        //System.out.println(str3); deger atanmadigi icin calismaz

    }
}
