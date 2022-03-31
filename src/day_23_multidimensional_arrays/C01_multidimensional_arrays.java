package day_23_multidimensional_arrays;

import java.util.Arrays;

public class C01_multidimensional_arrays {
    public static void main(String[] args) {

        int arr[][] = {{3, 1, 7}, {6, 10, 2}};

        System.out.println(arr[0][2]); // 7
        System.out.println(arr[1][1]); // 10


        // ilk inner array in tum elementlerini yazdirmak icin
        System.out.println(arr[0]);  //  arr [0] bir array oldugundan [I@3796751b  referans numarasini verir
        System.out.println(Arrays.toString(arr[0]));  // [3, 1, 7]
        System.out.println(Arrays.toString(arr)); // [[I@3796751b, [I@67b64c45] iki array oldugu icin yine referansini verir
        // MDarray de tum arrayleri yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[3, 1, 7], [6, 10, 2]]  deeptostring kullanilarak tum elemanlaara ulasilir


    }
}
