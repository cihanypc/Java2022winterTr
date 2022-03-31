package day_12_StringManupulation;

public class c01_indexOf {
    public static void main(String[] args) {

        /* kullanicidan bir kelime ve bir cumle isteyin kelimenin cumlede ki kullanimina bakarak
        - girilen kelime cumlede kullanilmamistir
        -girilen kelime cumlede 1 defa kullanilmisiti
        -girilen kelime cumlede 1 den fazla kullanilmistir
         */

        String cumle = "java ogren yeni program ile yeni bir sayfa ac";
        String kelime = "yeni";

        int ilkkullanim = cumle.indexOf(kelime); // -1 veya index cikar
        int ikincikullanim = cumle.indexOf(kelime, ilkkullanim + 1);

        if (ilkkullanim == (-1)) {
            System.out.println("girilen kelime cumlede kullanilmamis");
        } else if (ikincikullanim==(-1)) {
            System.out.println("istenen kelime cumle de bir kere kullanilmis");

        }else {
            System.out.println("girilen kelime birden fazla kullanilmistir");
        }


    }
}
