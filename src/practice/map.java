package practice;

import java.util.*;

public class map {
    // part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
// listeyi ters sırada sırala ve yazdır
// listeyi karıştır ve yazdır
// 3 yer sağa döndür ve yazdır

// part 2: find the max number and min number, print them
// replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
// tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> grupisimveuyeler = new HashMap<>();

        ArrayList<String> devteam = new ArrayList<>(Arrays.asList("Cihan", "Ismail", "Yasin"));
        ArrayList<String> qateam = new ArrayList<>(Arrays.asList("Kadir", "Ismet", "Gokhan", "Seher"));

        grupisimveuyeler.put("development team", devteam);
        grupisimveuyeler.put("qa team", qateam);
        System.out.println("grupisimveuyeler = " + grupisimveuyeler);

        //bolum 2
        // 1. yol

        Collection<ArrayList<String>> values = grupisimveuyeler.values();
        for (ArrayList<String> kisi : values
        ) {
            System.out.println(kisi.size());
        }
        // 2. yol

        Set<String> keys = grupisimveuyeler.keySet();
        for (String key : keys
        ) {
            ArrayList<String> gruplist = grupisimveuyeler.get(key);
            System.out.println("gruptaki uye sayisi " + key + " " + gruplist.size());
        }


    }
}
