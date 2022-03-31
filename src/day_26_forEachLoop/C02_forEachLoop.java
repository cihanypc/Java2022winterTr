package day_26_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_forEachLoop {
    public static void main(String[] args) {

        // 10 elementli bir list olusturalim
        int arr[] = {2, 4, 5, 8, 9, 45, 8, 5, 7, 4};

        List<Integer> sayilar = new ArrayList<>();
        for (int each : arr
        ) {
            sayilar.add(each);
        }

        // sayilar listesinden 3 e bolunemeyen sayilari for each loop ile yazdiralim
        for (int each:sayilar
             ) {
            if (each%3!= 0 ){
                System.out.print(each + " "); // 2 4 5 8 8 5 7 4
            }
        }

    }
}
