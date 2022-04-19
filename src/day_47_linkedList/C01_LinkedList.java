package day_47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        lik=nklistin 2 tane parent interface i vardir
        linklist olustururken data turu olarak linklist secersek ;
        iki parenttaki tum methodlar
        list secersek sadece list interface'deki methodlar
        deque secersek ; deque deki methodlari kullanilabiliriz
         */

        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(10);

        // sadecelist interface'inden ozellikler kullanmak istersek

        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);


        // sadece deque den gelen ozellikleri kullanmak icin

        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);  // 15,20

    }
}
