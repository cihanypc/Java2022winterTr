package day_30_pes_ByWalue;

import java.util.Arrays;

public class C06_PassByValue {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3]

        arrDegistir(arr);
        System.out.println("Method call sonrasi " + Arrays.toString(arr));  // [5, 6, 3]

    }

    private static void arrDegistir(int[] arr) {

        arr[0] = 5;
        arr[1] = 6;
        System.out.println(Arrays.toString(arr)); // [5, 6, 3]

        /*+
        non primitive data turlerinde objenin kendisi degil de
        icindeki elementler degisirse java objenin referansi ve objenin kendisi
        degismedigi icin element degisikliklerini kabul eder ve kalici yapar.
         */
    }


}
