package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day4_practice_7 {
    public static void main(String[] args) {

        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("olusturdugunuz istediginiz listenin uzunlugunu giriniz : ");
        int listlength = scan.nextInt();

        List<Integer> List = new ArrayList<>();
        System.out.println("girdiginiz listenin uzunlugu kadar eleman ekleyiniz");

        for (int i = 0; i < listlength; i++) {
            List.add(scan.nextInt());
        }

        tekrarlieleman(List);

    }

    private static void tekrarlieleman(List<Integer> list) {
        List<Integer> tekrarlilist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j) && !tekrarlilist.contains(list.get(i))) {
                    tekrarlilist.add(list.get(i));
                }
            }
        }

        System.out.println("tekrarkli listenin elemanlari : " + tekrarlilist);
    }
}
