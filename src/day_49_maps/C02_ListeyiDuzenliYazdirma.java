package day_49_maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {
    public static void main(String[] args) {
        // sinif listesini duzenli sekilde yazdirmak
        Map<Integer, String> sinif = Mapolustur.myMap();
        System.out.println(sinif);

        siniflistyazdir(sinif);

    }

    private static void siniflistyazdir(Map<Integer, String> sinif) {
        System.out.println("numara isim soyisim brans");
        System.out.println("*************************");

        // map yapisindan yazdirdigimiz da kullanicilar v=bir sey anlamayabilir
        // bunun icin once map yapisini kodlarla manipule edip
        // mad deki datalari istedigimiz formata sokmamiz gerekir
        // 1. adim key ve value'lari mapten alip iki farkli collection uyesine atadik
        Set<Integer> keyset = sinif.keySet();

        Collection<String> valueSet = sinif.values();

        System.out.println(keyset);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each: valueSet
             ) {
            System.out.println(each);
        }


    }
}
