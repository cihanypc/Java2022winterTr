package day_16_methodCreation;


public class c03_overloading {
    public static void main(String[] args) {
        // verilen iki sayiyi toplayip yazdiran bir method olusturalim

        int sayi1 = 10;
        int sayi2 = 20;

        ikisayitopla(sayi1, sayi2);

        double sayi3 = 15.2;
        double sayi4 = 10.3;

        ikisayitopla(sayi3, sayi4);

    }

    private static void ikisayitopla(double sayi3, double sayi4) {

        System.out.println("iki double toplami : " + (sayi3 + sayi4));
    }

    private static void ikisayitopla(int sayi1, int sayi2) {

        System.out.println("iki integer toplami : " + (sayi1 + sayi2));


    }// devam edecek


}
