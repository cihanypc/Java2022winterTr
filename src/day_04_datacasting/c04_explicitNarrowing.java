package day_04_datacasting;

public class c04_explicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 879;
        double sayi2 = 10;

        double sayi3 = sayi1 / sayi2;

        System.out.println(sayi3);

        // int sayi4= sayi1/sayi2; // 87.9 degerini verir bu deger int olmaz

        int sayi4 = (int) (sayi1 / sayi2); // bu sekilde olursa islemi kabul eder

        System.out.println(sayi4);  // yazdirdigimiz zaman 87 cikar

        // castin bir data turunu digerine cevirmek demektir.
        // once bolme islemini yapip sonra int e cevir demektir.

        int sayi5= 140;
       // byte sayi6=sayi5; //kabul etmiyor sag tarftaki deger int> sol taraftaki veriable byte
        byte  sayi6=(byte) sayi5;

        System.out.println(sayi6); // sonuc -116 cikiyor. 140 a ulasmak icin bytein sinirini gecemiyor
        // 140-128 yapiyor kalan 12 yi de -128 den cikartiyor sonuc bu yuzden -116 cikiyor.
        //  byte in sinirlari olan 128 den yukari olan sayilarda +128 ile -128
        // ile arasinda tur atar her 128 de +veya - yonde hareket eder.


    }
}
