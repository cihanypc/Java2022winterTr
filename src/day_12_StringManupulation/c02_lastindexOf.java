package day_12_StringManupulation;

public class c02_lastindexOf {
    public static void main(String[] args) {
            /* kullanicidan bir kelime ve bir cumle isteyin kelimenin cumlede ki kullanimina bakarak
        - girilen kelime cumlede kullanilmamistir
        -girilen kelime cumlede 1 defa kullanilmisiti
        -girilen kelime cumlede 1 den fazla kullanilmistir
         */

        String cumle = "java ogren yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkkullanim = cumle.indexOf(kelime); // -1 veya index cikar
        int sonkullanim = cumle.lastIndexOf(kelime);

        if (ilkkullanim == (-1)) {
            System.out.println("girilen kelime cumlede kullanilmamistir");

        } else if (ilkkullanim == sonkullanim) {
            System.out.println("girilen kelime cumlede bir kere kullanilmistir");
        } else {
            System.out.println("girilen kelime 1 den fazla kullanilmistir");

        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4));
    }
}
