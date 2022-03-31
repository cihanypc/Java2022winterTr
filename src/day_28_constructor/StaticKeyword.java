package day_28_constructor;

public class StaticKeyword {

    static int sayi1;
    int sayi2;

    public static void main(String[] args) {
        System.out.println("sayi1 : "+sayi1); // 0
        // System.out.println("sayi2 : " + sayi2); static olmadigi icin main method dan direk kullanamayiz

        StaticKeyword obj1= new StaticKeyword(); // static olmayan bir datayi yazdirmak icin obje olusturmak gerekir
        System.out.println(obj1.sayi2); // 0

        sayi1++;
        obj1.sayi2++;
        System.out.println("sayi1 : "+sayi1); // 1
        System.out.println(obj1.sayi2); // 1

        System.out.println(obj1.sayi1); // 1  boylede yazdirilabilir


        StaticKeyword obj2= new StaticKeyword();
        System.out.println(obj2.sayi2); // 0  sayi2 instance oldugundan ilk halini alir
        System.out.println(obj2.sayi1); // 1  sayi1 static oldugundan son halini alir

        /* static veriable lar direk class a baglidir.
           class icerisinde yapilan her turlu degisiklik  static veriable larda kalici olur

           instance veriable lar ise objeye baglidir. instance veriable lara sadece obje uzerinden erisilebilir
           ve bir obje uzerinden erisirlerek yapilan degisiklik instance veriablenin degereini kalici olarak degistirmez
           sadece o obje icin instance veriable degerini kalici olarak degistirir.

         */

        obj2.sayi1++;
        obj2.sayi2++;

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 2


        System.out.println(obj1.sayi2); // 1
        System.out.println(obj1.sayi1); // 2

        // sayi1 static oldugunda her degisimi de kalici olur

        obj1.sayi1++;
        obj1.sayi2++;

        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1); // 3

        System.out.println(obj2.sayi2); // 1
        System.out.println(obj2.sayi1); // 3


    }
}
