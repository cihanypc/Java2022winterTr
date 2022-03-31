package day_22_Arrays;

import java.util.Arrays;

public class C04_terstensiralayipkaydetme {
    public static void main(String[] args) {

        // verilen bir arrayi buyukten kucuge siralayip bize donduren bir method olusturun

        int arr[] = {3, 5, 6, 9, 1, 45, 25, 8, 85};

        arr = terstensirala(arr);
        System.out.println(Arrays.toString(arr)); //[85, 45, 25, 9, 8, 6, 5, 3, 1]
        System.out.println("en buyuk element : " + arr[0]); // 85
    }

    public static int[] terstensirala(int[] arr) {

        Arrays.sort(arr);  // [1, 3, 5, 6, 6, 8, 9, 25, 45, 85]

        int tersArr[] = new int[arr.length]; //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(tersArr));

        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];
        }
        return tersArr;

    }
}
