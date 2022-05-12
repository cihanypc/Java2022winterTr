package day_51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    /*
    verilen bir strng deki harfleri ve harflaerin kacar kez kullanildigini return eden bir method yaziniz
     */
    public static void main(String[] args) {


        String input = "Hellooo";
        String harflerArr[] = input.split("");

        Map<String, Integer> kullanimsayilari = new HashMap<>();

        for (String each : harflerArr
        ) {
            if (kullanimsayilari.containsKey(each)) {
                kullanimsayilari.put(each, kullanimsayilari.get(each) + 1);
            }else {
                kullanimsayilari.put(each,1);
            }
        }

        System.out.println(kullanimsayilari);
    }


}

