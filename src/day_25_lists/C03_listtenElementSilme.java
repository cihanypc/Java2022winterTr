package day_25_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_listtenElementSilme {
    public static void main(String[] args) {

        // verilen bir array den istenen elementi ( kac tane varsa ) silip kalanlari
        // yeni bir array olarak yazdiran bir meethod olustrun

        int arr[] = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyeneleman = 5;
        istenmeyenelementisil(arr, istenmeyeneleman);

    }

    public static void istenmeyenelementisil(int[] arr, int istenmeyeneleman) {

        List<Integer> yenilist=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=istenmeyeneleman){
                yenilist.add(arr[i] );
            }
        }

        System.out.println(yenilist);  // [3, 4, 2, 3, 7, 3, 8, 2, 4]
    }
}
