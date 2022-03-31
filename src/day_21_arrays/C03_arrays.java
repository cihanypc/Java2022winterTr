package day_21_arrays;

import java.util.Arrays;

public class C03_arrays {
    public static void main(String[] args) {

        int arr1[]; // deger atamasi yapmadik ama java kabul etti
        // arr1={1,2,3}; // yine itiraz ediyor cunku bu arrayin icerik adeti belirtilmedigi icin

        //  System.out.println(Arrays.toString(arr1)); //  deger atanmadigi icin yazdirirken hata verir
        arr1 = new int[3];
        System.out.println(Arrays.toString(arr1)); // 0 0 0
        System.out.println(arr1.length);  // 3
        // String deki length metodunda parantez olurdu bunde yok
        // array deki her bir elemani index degeri kadar artiralim

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] += i;
        }
        System.out.println(Arrays.toString(arr1)); // 0 1 2
        // son index teki elementi yazdiralim
        System.out.println(arr1[arr1.length-1]);  // 2

    }
}
