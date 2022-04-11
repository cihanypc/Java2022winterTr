package day_40_overriding_Pollymorphism;

public class C04_Exceptions {
    public static void main(String[] args) {


    /*
    String olaraak verilen bir sayiyi int cevirip iki katini ekranda yazdiralim
     */

    String str = "1234a";

    // str icinde sayi olmayan bir karakter olursa
    //numberformatExcepions.forinputString verir.

      //  System.out.println("girilen sayinin iki kat : " + 2*sayi);


        try {
            int sayi = Integer.parseInt(str);
            System.out.println("girilen sayinin iki kat : " + 2*sayi);

        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println("Girdiginiz string sayi olmayan karakterler iceriyor ");
        }

    }
}
