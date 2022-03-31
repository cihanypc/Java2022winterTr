package day_05;

import java.util.Locale;

public class c04_wrapperClass {
    public static void main(String[] args) {
        // primitive data turu ile non-primitive arasindaki farklar nelerdir?


        String str="java";
        int sayi=10;
        System.out.println(str.toUpperCase(Locale.ROOT)); // JAVA

        //non- primitive data turleri data depolamak yaninda bircok faydali methoda sahiptir.
        // ancak primitive data turlerinin boyle ozlelikleri yoktur.
        // sadece degerleri saklarlar

        // primitive data turleri icinde bazi methodlar gerekli oldugunda
        //java ara bir cozum uretmistir
        //java her bir primitive data turunu non primitive olarak kullanabilmek icin
        //ozel class'lar olusturmustur ve bunlara Wrapper Class adini vermistir.

        double sayi2=20.5;
        // sayi2 primitive oldugundan sayi2. yaptigimizda bi method gelmez

        Double sayi3=15.2;

        //sayi3 Wrapper class olan Double classini kullandigindan
        // sayi3. dedigimizda bircok method gelir
        // wrapper clasini acmak icin veriable buyuk harfle baslanir




    }
}
