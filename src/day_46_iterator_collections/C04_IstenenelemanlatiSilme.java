package day_46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_IstenenelemanlatiSilme {
    public static void main(String[] args) {
// verilen listede ki istenen sayi araliginda olmayanlari silin

        List<Integer> liste = new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        ListIterator itr = liste.listIterator();

        while (itr.hasNext()) {
            Object sayi = itr.next();
            if ((Integer) sayi > 23 && (Integer) sayi < 40){
                itr.remove();
            }

        }
        System.out.println(liste);
    }
}
