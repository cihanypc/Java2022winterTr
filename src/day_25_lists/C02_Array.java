package day_25_lists;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        // verilen bir array den istenen elementi ( kac tane varsa ) silip kalanlari
        // yeni bir array olarak yazdiran bir meethod olustrun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyeneleman = 3;
        istenmeyenelementisil(arr, istenmeyeneleman);
    }

    public static void istenmeyenelementisil(int[] arr, int istenmeyeneleman) {

        /* istenmeyen eleman say
            yeni array olustur
            eski array den uygun elementleri yeniye tasi
            yazdir
         */
        // 1 istenmeyen element sayisini bulalim
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyeneleman) {
                sayac++;

            }
        }

        // 2 yeni array i olusturalim
        int arryeni[] = new int[arr.length - sayac];

        // 3 esski array den uygun elementleri yeniye tasi
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != istenmeyeneleman) {
                arryeni[index]=arr[i];
                index++;
            }
        }
        // sout listeyi yazdirmak
        System.out.println(Arrays.toString(arryeni)); // [4, 2, 5, 7, 8, 5, 2, 4]

    }
}
