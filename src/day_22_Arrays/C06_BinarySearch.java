package day_22_Arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 9, 1, 45, 25, 8, 85, 0};
        int istenensayi = 10;
        // burda girilen sayinin siralamasi hangi araliga gelecekse oranin index degerini verir
        // eger java dan hazir BinarySearch ile yapmak isterseniz
        // once sort methodu kullanip sonra binarysearch yapmaliyiz

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [0, 1, 3, 5, 6, 8, 9, 25, 45, 85]
        System.out.println(Arrays.binarySearch(arr,istenensayi)); //  burda girilen sayi kadar  index i verir
        //  eger olmayan bir elementi aratirsak
        // java bulamadigini gostermek icin - isareti koyar
        // sonra da o sayi olsaydi siralamasi ne olacak ise o sirayi bize verir
        // girilen deger yoksa  - ve siralama degerini yazdirir


    }
}
