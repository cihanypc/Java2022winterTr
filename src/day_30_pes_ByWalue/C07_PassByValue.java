package day_30_pes_ByWalue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("Method call sonrasi : " + Arrays.toString(arr)); // [1, 2, 3]

    }

    private static void arrDegistir(int[] arr) {

        arr = new int[5];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0]


    }
}
