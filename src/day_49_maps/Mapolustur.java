package day_49_maps;

import java.util.HashMap;
import java.util.Map;

public class Mapolustur {
    public static Map<Integer, String> myMap() {
        Map<Integer, String> siniflist = new HashMap<>();

        siniflist.put(101, "Cihan, Yapici, Dev, 4563");
        siniflist.put(102, "Yunus, Yapi, QA, 4589");
        siniflist.put(103, "Cihan, Yapi, C#, 1245");
        siniflist.put(104, "Cihan, Yapi, Java, 1245");

        return siniflist;
    }
}
