package day_48_collections;

import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // verilen bir array in tekrar eden elementlerini sadece bir kere yazdiran bir method olusturunuz


        Integer arr[] = {3, 4, 8, 6, 5, 8, 4, 1, 2, 5, 8, 5, 8, 6};
        arrayiTekrarsizyazdir(arr);


    }

    private static void arrayiTekrarsizyazdir(Integer[] arr) {

        Set<Integer> tekrarsizelemanlar = new HashSet<>();

        for (Integer each : arr
        ) {
            tekrarsizelemanlar.add(each);
        }
        System.out.println(tekrarsizelemanlar);
    }
}
