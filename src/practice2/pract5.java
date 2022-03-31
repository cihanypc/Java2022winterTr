package practice2;

import java.util.ArrayList;

public class pract5 {
    public static void main(String[] args) {

        /* {3,5,1,2,7,9,2,3,5,7} verilen datanin 1 ,2, 3, 4 varsa 5 li toplayin
        ardisik array elemanlarinin toplamini hesaplayan bir method create ediniz
         */

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisiktopla(arr));

    }

    private static ArrayList<Integer> ardisiktopla(int[] arr) {

        ArrayList<Integer> toplanansayilarlist = new ArrayList<>();

        int count = 0;
        int toplanansayiadedi = 1;

        while (arr.length - toplanansayiadedi >= count) {
            int toplam = 0;
            for (int i = 0; i <= count; i++) {
                toplam += arr[toplanansayiadedi - 1 + i];

            }
            count++;
            toplanansayiadedi+=count;
            toplanansayilarlist.add(toplam);

        }
        return toplanansayilarlist;  // [3, 6, 18, 17]
    }
}
