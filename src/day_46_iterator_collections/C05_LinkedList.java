package day_46_iterator_collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {

        // hem list hemde queue'nun child classidir.
        LinkedList <Integer> list= new LinkedList<>();
        list.add(5);
        list.add(10); // add methodu list den geldigi icin sona ekler
        list.addFirst(11);   // addfirst deque den gelir basa ekler
        list.addLast(45);   // addfirst deque den gelir sona ekler


        System.out.println(list);

        list.add(2,8);
        System.out.println(list);



    }
}
