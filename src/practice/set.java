package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        //  PART 1
// create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
// and add all elements from ArrayList to Set

// ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
// ve tüm öğeleri ArrayList'ten Set'e ekleyin

// PART 2
// create a method that takes Set<Character> and varargs of char as parameters
// and adds all chars to the set

// Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
// ve tüm karakterleri sete ekleyin


        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);
        arrlist.add(40);
        arrlist.add(50);
        arrlist.add(50);
        arrlist.add(20);

        System.out.println("arrlist = " + arrlist);

        Set<Integer> set = new HashSet<>();
        System.out.println("set = " + set);

        arraylisttenSetedonustur(arrlist, set);
        System.out.println("arrlisti sete aktardiktan sonra " + set);

        // bolum 2

        Set<Character> characterSet = new HashSet<>();
        karakterleriseteekle(characterSet, 'Q', 'A', 'F', 'y', 'u');

        System.out.println("karakterler sete eklendikten sonra " + characterSet);


    }

    private static void karakterleriseteekle(Set<Character> characterSet, Character... chars) {

        for (int i = 0; i < chars.length; i++) {
            characterSet.add(chars[i]);
        }
    }

    private static void arraylisttenSetedonustur(ArrayList<Integer> arrlist, Set<Integer> set) {


        for (Integer sayi : arrlist) {
            set.add(sayi);
        }
    }
}
