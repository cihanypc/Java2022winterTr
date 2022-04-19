package day_46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_ListeyiTerstenYazdirma {
    public static void main(String[] args) {
        // verilen listeyi sondan basa dogru yazdiralim

        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);

        // once iterator olusrturup sona yollamak lazim

        ListIterator itr = liste.listIterator();

        while (itr.hasNext()) {
            itr.next();
        }
        while (itr.hasPrevious()) {
            System.out.println(itr.previous() + " ");
        }


    }
}
