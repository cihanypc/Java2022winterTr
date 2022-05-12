package day_52_maps;

import day_49_maps.Mapolustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {


        Map<Integer, String> siniflistMap = Mapolustur.myMap();

        System.out.println(siniflistMap);

        System.out.println(siniflistMap.entrySet());

        /*
        myMap... entryset  methodu bize entry'lerden olusan bir set dondururur.
        eger bu entryleri manipule etmek istiyorsak
        methodun dondurdugu seti yeni bir set olusturup store etmeliyiz.
         */

        Set<Map.Entry<Integer, String>> sinifEntrySet = siniflistMap.entrySet();

        System.out.println("No   Isim   Soyisim   Brans   Dogumyili");
        System.out.printf("___________________________________________");

        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            Integer entrykey = each.getKey();
            String valuestr = each.getValue();

            String valuearr[] = valuestr.split(", ");
         //   System.out.println(entrykey + " " + valuearr[0] + " " + valuearr[1] + " "
           //         + valuearr[2] + " " + valuearr[3]);

            System.out.printf("%-4d %-6s %-9s %-6s %s\n", entrykey, valuearr[0], valuearr[1],
                    valuearr[2], valuearr[3]);


            // System.out.println(each);
        }
        System.out.printf("___________________________________________");

    }
}
