package day_25_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_listedentekrarliElementleriSilme {
    public static void main(String[] args) {

        // verilen bir liste de tekrar eden sayilari sadece bir kere yazdiran bir method olustrun
        // orn [1,3,5,3,5,6,1,7]
        //output [1,3,5,6,7]

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        tekrarsizlisteolustur(sayilar);

    }

    public static void tekrarsizlisteolustur(List<Integer> sayilar) {

        List<Integer> tekrarsizlist = new ArrayList<>();

        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizlist.contains(sayilar.get(i))) {
                tekrarsizlist.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizlist);

    }
}
