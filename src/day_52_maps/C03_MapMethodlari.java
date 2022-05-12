package day_52_maps;

import java.util.HashMap;
import java.util.Map;

public class C03_MapMethodlari {
    public static void main(String[] args) {


        Map<String, Integer> myMAp = new HashMap<>();
        myMAp.put("H", 3);
        myMAp.putIfAbsent("K", 5);

        // bir ekleme yapmak istedigimmiz de key daha once eklenmemisse map'e eklesin
        // daha once eklenmisse eskiyi silmemek icin bizi uyarsin

        System.out.println(myMAp.putIfAbsent("A", 6));
        System.out.println(myMAp.putIfAbsent("K", 20));

        if (myMAp.putIfAbsent("K", 20) != null) {
            System.out.println("Girdiginiz key map'te var ");
        }
        System.out.println(myMAp);
        // System.out.println(myMAp); // {A=6, H=3, K=5}


        myMAp.compute("A", (key, value) -> 20);
        myMAp.compute("H",(key,value) -> (2*value+5));

        System.out.println(myMAp);

    }
}
