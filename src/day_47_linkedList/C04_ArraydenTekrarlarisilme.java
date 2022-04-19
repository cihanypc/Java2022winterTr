package day_47_linkedList;

import java.util.HashSet;
import java.util.Set;

public class C04_ArraydenTekrarlarisilme {
    public static void main(String[] args) {


    /*
    verilen bir arrayden tekrar eden elementleri silip unique elementlerden olusan bir array
    haline donduren bir method yazdirin

     */

        int arr[] = {3, 4, 8, 6, 5, 8, 4, 1, 2, 5, 8, 5, 8, 6};

        arr= benzersizyap(arr);


    }

    private static int[] benzersizyap(int[] arr) {

        Set <Integer> benzerseizset = new HashSet<>();

        for (Integer each: arr
             ) {
            benzerseizset.add(each);
        }
        System.out.println(benzerseizset);  // [1, 2, 3, 4, 5, 6, 8]

        return arr;
    }

}
