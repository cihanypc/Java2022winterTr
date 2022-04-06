package day_33_varargs_StringBuilder;

public class C05_StringBuilder {

    public static void main(String[] args) {
/*
    compare iki sb i esit mi diye kontrol etmek icin
     ilk harften baslayarak tum karakterleri karsilastirir
    ayni olan karakterler icin birsey yazdirmaz
    farkli olan ilk karakter icin  ascii tablosuna gore kac deger geride veya ileri de oldugunu yazdirir.
 .  */
        StringBuilder sb1 = new StringBuilder("Ali Can");
        StringBuilder sb2 = new StringBuilder("Aki can");

        String str = "Ali Can";

        System.out.println(sb1.compareTo(sb2));  // 1

       //  System.out.println(sb1.compareTo(str));
    }
}
