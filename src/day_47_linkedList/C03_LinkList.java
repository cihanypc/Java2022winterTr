package day_47_linkedList;

import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkList {
    public static void main(String[] args) {

        Queue<Integer> ll1 = new LinkedList<>();

        //System.out.println(ll1.element()); // bosken kullanilirsa exception firlatir
        System.out.println(ll1.peek());  // bosken kullanildiginda null verir
        System.out.println(ll1.poll()); // bosken null dondurur

        ll1.remove(50);  // object olarak 50 yi siler

    }
}
