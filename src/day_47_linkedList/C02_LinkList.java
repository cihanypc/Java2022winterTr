package day_47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkList {
    public static void main(String[] args) {

        Deque <Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10);  // basa element ekler
        ll1.addLast(20);  // sonar element ekler
        System.out.println(ll1);
        System.out.println(ll1.element());  // 10 ilk elementi getirir ama silmez

        System.out.println(ll1.getLast()); // son elementi getirir ama silmez
        System.out.println(ll1.getFirst());  //ilk elementi getirir ama silmez

        ll1.offer(30);
        System.out.println(ll1);
        ll1.offerFirst(40);
        System.out.println(ll1);
        ll1.offerLast(50);
        System.out.println(ll1);

        System.out.println(ll1.peek());  // ilk elementi getirir bulamazsa null verir.
    }
}
