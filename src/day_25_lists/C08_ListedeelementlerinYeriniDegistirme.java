package day_25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeelementlerinYeriniDegistirme {
    public static void main(String[] args) {

        // verilen bir listede istenen iki index deki elementlerin yerini
        // kalici olarak degistiren bir method olustrun


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        int ilkindex = 2;
        int ikinciindex=5;
        sayilar= swapElements(sayilar, ilkindex,ikinciindex);

    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkindex, int ikinciindex) {
        // bir tem sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kkontrol edip sinir otesinde index verildiyse uyari mesaji yazdirin




        return sayilar;
    }
}
