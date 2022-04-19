package day_46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();

        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);

        Iterator itr = liste.iterator();
        /*
        iterator methodunu olusturdugumuz liste objesi uzerinden arraylist class 'indan calistiriyoruz.

        iterator  nasil calisir ?
        bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz
        b,i,z bu iterator objesini bizim ornegimizde liste objesi uzeride calismak icin olusturduk.

        iterator objesini olusturdugumuzda  iterator collection'in ilk elementinin oncesine gelip bekler

        ,[(itr)5,7,8,6,9]
        itr.hasNext()   true
        itr.next()  5 en basta oldugu icin ilk karakteri yazdirirbir daha yazdirdigi zaman bir sonrakini calistirir
        itr.next()  7  bir sonraki elementin yanina gecer
         itr.remove();  oldugu elementi siler  ust uste iki kere kullanilamaz
         once itr.next methodu calistirilip iterator'in bir element almasi saglanmalidir.

         */

        System.out.println(itr.hasNext()); // true  yaninda bir sey var mi diye sorar
        System.out.println(itr.next());  // 5
        System.out.println(itr.next());  // 7
        itr.remove();  // en son 7 de oldugu icin 7 yi siler
        System.out.println(liste);  // [5, 8, 6, 9]


    }
}
