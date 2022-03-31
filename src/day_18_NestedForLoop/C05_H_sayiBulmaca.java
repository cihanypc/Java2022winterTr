package day_18_NestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class C05_H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd = new Random();
        int sayi = rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur

        Scanner scan = new Scanner(System.in);
        int tahmin = 0;
        int sayac = 1;

        while (sayi != tahmin) {
            System.out.println("tahmininizi giriniz : ");
            tahmin = scan.nextInt();

            if (tahmin > sayi) {
                System.out.println("daha kucuk bir sayi soyleyin ");
            } else if (tahmin < sayi) {
                System.out.println("daha buyuk bir sayi soyleyin");

            }
            sayac++;

        }
        System.out.println("tuttugum sayiyi " + sayac + " tahminde buldunuz.");
    }


}
