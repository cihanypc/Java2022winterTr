package day_09_ternary_Switch;

import java.util.Scanner;

public class c01_NestedIfElse {
    public static void main(String[] args) {
        // soru ru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
        //çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 4 basamakli pozitif bir tam sayi giriniz");

        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) { // istenmeyen durumu yaziyoruz

            System.out.println("lutfen 4 basamakli sayi giriniz : ");

        } else if (sayi % 5 == 0) { // sayi 5 e tam bolunur demektir

            if (sayi % 10 == 0) { //4 basamakli ve 5 e bolumunden kalan 0 olur

                System.out.println("5'e bolunen cift sayi");

            } else {  //else bolunebilen tek sayi

                System.out.println("5'e bolunebilen tek sayi");
            }


        } else { // sayi 4 basamakli ve 5 e bolunemiyor

            System.out.println("tekrar deneyin ");
        }

    }

}
