package day_50_maps;

import day_49_maps.Mapolustur;

import java.util.*;

public class C01_maps {

    public static void main(String[] args) {
        // siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> siniflistmap = Mapolustur.myMap();
        System.out.println(siniflistmap);

        /*
        eger key'lere tek tek ulasmak istersek index yapiisna ihtiyacimniz var
        ancak map index yapisini desteklemez.
        buinun icin keyleri once bir set'e sonra da set'in tum elementleruini bir list'e ekledik

         */

        Set<Integer> sinifkeyseti = siniflistmap.keySet();
        // Integer keyarray[] = new Integer[sinifkeyseti.size()];  array list olusturma
        List<Integer> keylist = new ArrayList<>();

        keylist.addAll(sinifkeyseti);

        System.out.println(keylist);
        System.out.println(keylist.get(1));


        // simdi de value'leri index ile ulasabilcegimiz bir sekle sokalim

        Collection<String> sinifvaluecoll = siniflistmap.values();
        System.out.println(sinifvaluecoll);

        List<String> sinifvaluelist = new ArrayList<>();
        sinifvaluelist.addAll(sinifvaluecoll);

        System.out.println(sinifvaluelist);

        /*  her bir value value birden fazla bilgiyi iceriyor
            onun icin value 'leri multidimensional bir arraye atmak mantikli duruyor
            ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

        */

        int outerArrayboyut = sinifvaluelist.size();
        System.out.println(outerArrayboyut);

        // inner array'lerin boyutunu bulmak daha komplex olur

        String ilkvalue = sinifvaluelist.get(0);
        System.out.println(ilkvalue);
        String ilkValueArray[] = ilkvalue.split(", ");
        int innerarrayboyut = ilkValueArray.length;

        String valueMDA[][] = new String[outerArrayboyut][innerarrayboyut];

        for (int i = 0; i < outerArrayboyut; i++) {
            String temp[] = sinifvaluelist.get(i).split(", ");

            for (int j = 0; j < innerarrayboyut; j++) {

                valueMDA[i][j] = temp[j];


            }

        }
        //  System.out.println(Arrays.deepToString(valueMDA));  // [[Cihan, Yapici, Dev], [Yunus, Yapi, QA], [Cihan, Yapi, C#]]

        /* bu satira kadar key'leri index ile ulasabildigimiz keylist'e atandi
        value'leri valuMDA 'e atandi
        bu key ve valuleri istedigim gibi manipule edilebilir.

        */
        System.out.println("numara isim soyisim brans");
        System.out.println("*************************");
        for (int i = 0; i < keylist.size(); i++) {
            System.out.print(keylist.get(i) + "   ");
            for (int j = 0; j < innerarrayboyut; j++) {
                System.out.print(valueMDA[i][j] + "  ");
            }
            System.out.println("");
        }


    }
}
