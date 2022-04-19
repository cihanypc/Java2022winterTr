package day_46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {


        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);
    /*
    listenin tum elementlerini bize getirmesi icin iterator'in hasnext ve next methodlarini beraber kullaniriz
     */
      /*  Iterator itr = liste.iterator();
        while (itr.hasNext()) { // yaninda element oldugu muddetce calisir

            System.out.println(itr.next());

            itr.next();


        }*/

        ListIterator itr1 = liste.listIterator();
        while (itr1.hasNext()) {
            Object sayi = itr1.next();
            itr1.set((Integer) sayi + 3);


        }
        System.out.println(liste); // [8, 10, 11, 9, 12]
    }
}
