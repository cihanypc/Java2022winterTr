package day_52_maps;

import day_49_maps.Mapolustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
        /*
        verilen map'deki tum branslari java yapalim
         */
/*
        map'de value kompleks olabildigi icin value icerisinden bir bolumu degistirmek istersek
        once value'ye ulasmak  sonra onu manipule ederek istedigimiz degisikligi yapmak ve en son degismis halini
        yeniden map'e eklemek gerekir
 */
        Map<Integer, String> siniflistMap = Mapolustur.myMap();

        System.out.println(siniflistMap);

        Set<Map.Entry<Integer, String>> sinifentryset = siniflistMap.entrySet();
        for (Map.Entry<Integer, String> each : sinifentryset
        ) {
            Integer keyentry = each.getKey();
            String valueentry = each.getValue();
            String valuearr[] = valueentry.split(", ");
            valuearr[2] = "Java";

            String valueyeni = valuearr[0] + ", " + valuearr[1] + ", " + valuearr[2] + ", " + valuearr[3];

            siniflistMap.put(keyentry,valueyeni);
            System.out.println(siniflistMap);

        }
    }
}
