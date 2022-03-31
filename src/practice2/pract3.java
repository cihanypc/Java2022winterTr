package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class pract3 {
    public static void main(String[] args) {
        /*
        verilen arraydeki tekrar eden sayilari ilki haric silip tekrarsiz sayilardan olusan bir array halibne getiren
        bir code create ediniz
        input {1,2,2,3,1,4,2,5,6,7,8,5,9,1}
        output {1,2,3,4,5,6,7,8,9}
         */

        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5, 6, 7, 8, 5, 9, 1};
        List<Integer> tekrarsizlist = new ArrayList<>();
        for (Integer s : arr) {
            if (!tekrarsizlist.contains(s)) {
                tekrarsizlist.add(s);

            }
        }

        Collections.sort(tekrarsizlist);

        int tekrarsizarray[] = new int[tekrarsizlist.size()];
        for (int i = 0; i < tekrarsizlist.size(); i++) {
            tekrarsizarray[i] = tekrarsizlist.get(i);
        }
        System.out.println("bir tane olan eleman : " + Arrays.toString(tekrarsizarray)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
