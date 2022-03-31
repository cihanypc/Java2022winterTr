package day_06;

public class c02_mantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5 + 2 == 8);// false

        boolean sonuc1 = 5 > 4 && 7 < 9 && 6 + 3 == 9 && 5 + 2 != 8;
        // hepsei True oldugu icin ve and isreti (&&)oldugu icin sonuc True

        System.out.println(sonuc1); // True

        boolean sonuc2 = 5 > 4 && 7 > 9 && 6 + 3 == 9 && 5 + 2 != 8;
        System.out.println(sonuc2);//False

        boolean sonuc3 = 5 > 4 & 7 > 9 & 6 + 3 == 9 & 5 + 2 != 8;
        System.out.println(sonuc3); //False

        /* && ile & arsindaki fark
        sonuc acisindan fark yok
        tek olan tum islemi denetler
        cift olan ilk false da durur.

        * */

        int sayi3=15;
        //sayi3'un 10 ile 20 arasinda oldugunu True diyerek dondurelim
        // java 3lu karsilastirma kabul etmez
        // ikili karsilastirma yaparak mantiksal oparetorlerle birlestirmeliyiz

        System.out.println(10<sayi3 && sayi3<20); // True

        int sayi4=5;
        //sayi 4 un 10 ile 20 arasinda olmadigini True ile gosterelim

        System.out.println(sayi4<10 || sayi4>20); // True






    }
}
