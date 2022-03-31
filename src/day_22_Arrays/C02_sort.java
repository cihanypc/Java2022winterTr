package day_22_Arrays;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {
        // verilen bir arrays de en kucuk ve en buyuk degerleri yazdirin

        int arr[] = {3, 5, 6, 9, 1, 45, 25, 8, 6, 85};
        // sort methodu olmadan yapalim

        int enkucuksayi = Integer.MAX_VALUE;//arr[0];
        int enbuyuksayi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < enkucuksayi) {
                enkucuksayi = arr[i];

            }

            if (arr[i] > enbuyuksayi) {
                enbuyuksayi = arr[i];
            }
        }
        System.out.println("Array deki en kucuk sayi : " + enkucuksayi);
        System.out.println("Array deki en buyuk sayi : " + enbuyuksayi);


        Arrays.sort(arr);
        System.out.println("Array deki en kucuk sayi : " + arr[0]);
        System.out.println("Array deki en buyuk sayi : " + arr[arr.length - 1]);


    }
}
