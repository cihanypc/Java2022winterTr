package day_26_forEachLoop;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class C03_foreachloop3 {
    public static void main(String[] args) {

        // iki string array olustrunuz
        //bu arraylerde ki ortak elemanlari for each loop kullanarak bulunuz
        // sonucu yazdiriniz
        // ortak eleman yoksa ekrana "ortak eleman yok yazdiriniz"


        String array1[]= {"ali","ayse","can","fatma"};
        String array2[]= {"can","evren","emsal","fatma","emre","ali"};

        List<String> ortakelemanlar = new ArrayList<>();

        for (String each1:array1
             ) {
            for (String each2:array2
                 ) {
                if (each1.equals(each2)){
                    ortakelemanlar.add(each1);
                }

            }
        }
        if (ortakelemanlar.isEmpty()){
            System.out.println("Ortak eleman yok");
        } else{
            System.out.println("Iki array'deki ortak elemanlar : " + ortakelemanlar);

        }
    }


}
