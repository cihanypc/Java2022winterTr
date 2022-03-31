package day_21_arrays;

import java.util.Arrays;

public class C02_arrays {
    public static void main(String[] args) {


        String arr1[] = {"ali", "vali", "cihan"};
        // array icindeki elementlere ulasabilmek icin index kullanilir

        System.out.println(arr1[0]); // ali

        arr1[1] = "esila";

        System.out.println(arr1[1]);  // esila

        int arr2[] = new int[4];
        System.out.println(arr2[1]);  // 0
        System.out.println(arr2[3]);  // 0
        // System.out.println(arr2[5]); // hata verir cunku arr2 bu index e sahip degil

        // array in tamamini yazdirmak istersek
        System.out.println(arr2); // direk yazdirmak istersek java referans degerini yazdirir

        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");  // 0 0 0 0
        }

        System.out.println("");

        // array i yazdirmak icin java daki arrays class indan toString() kullanilir

        System.out.println(Arrays.toString(arr2)); // 0 0 0 0

        arr2[1]=11;
        arr2[3]=22;

        System.out.println();
        System.out.println(Arrays.toString(arr2));  // 0 11 0 22



    }
}
