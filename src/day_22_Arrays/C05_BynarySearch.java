package day_22_Arrays;

import java.util.Arrays;

public class C05_BynarySearch {
    public static void main(String[] args) {
        // verilen array de istenen bir elementin vaar olup olmadigini true False
        // olarak gosteren bir method olusturun

        int arr[] = {3, 5, 6, 9, 1, 45, 25, 8, 85, 0};
        int istenensayi = 0;

        istenenelemanvarmi(arr, istenensayi);

    }

    private static void istenenelemanvarmi(int[] arr, int istenensayi) {
        boolean sonuc = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenensayi) {
                sonuc = true;
                break;
            }
        }

        System.out.println(sonuc);
    }
}       // if den sonra else yazsaydik hepsini kontrol edip butun hepsine false yazardi
    // bu yuzden boolean olustruldu ilki false atandi
// if ten sonra da sonuc a true atandi

