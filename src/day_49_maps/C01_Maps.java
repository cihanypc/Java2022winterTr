package day_49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        // java da collection uyesi bir yapida data turu object secilirse
        // her data turunden deger ekleyebiliriz
        // ancak bu durumda surekli casting problemleri ile karsilasiriz.

        List<Object> list = new ArrayList<>();
        list.add("Cihan");
        list.add(15);
        list.add(15.2);

        System.out.println(list);

        list.set(1, (Integer) (list.get(1)) + 10);

        Map<Integer, String> siniflist = new HashMap<>();
        /*
        bir sinifta ogrenci no ve isim soyisim ve brans olarak map olusturmak istiyoruz
        key tek bir unique degerdir
        ama value/deger birden fazla bilginin birlesiminden olusabilir
        bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        tum elemanlar icin value ayni bicimde olusturulmalidir.
        (Veri siralamasi ve sekilsel acidan )

         */

       siniflist.put(101,"Cihan, Yapici, Dev");
       siniflist.put(102,"Yunus, Yapi, QA");
       siniflist.put(103,"Cihan, Yapi, C#");

        System.out.println(siniflist);

        System.out.println(siniflist.keySet()); // [101, 102, 103]

        System.out.println(siniflist.values());  //  Cihan, Yapici, Dev, Yunus, Yapi, QA, Cihan, Yapi, C#]




    }
}
