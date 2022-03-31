package day_22_Arrays;

import java.util.Arrays;

public class C03_buyuktenkucugesuralama {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip bir method olusturun

        int arr[] = {3, 5, 6, 9, 1, 45, 25, 8, 6, 85};

        terstensiralayazdir(arr);

    }

    public static void terstensiralayazdir(int[] arr) {

        Arrays.sort(arr);  // [1, 3, 5, 6, 6, 8, 9, 25, 45, 85]

        int tersArr[] = new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(tersArr));

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(tersArr)); // [85, 45, 25, 9, 8, 6, 6, 5, 3, 1]
        // tersten siralamak icin ayni uzunlukta bir array daha olusturuldu
        // fori loop ile de -1 ve -i kullanarak ters siralama olusturuldu



    }

}
