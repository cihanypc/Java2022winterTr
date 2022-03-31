package day_15_methodcreation;

public class C06_methodcreation {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // iki variable nin degerlerini toplayan bir method olusturalim

        ikisayitopla(a, b);
        // method ancak cagirilirsa calisir
        // ayni clasta veya farkli clasta olmasina gerek yoktur
        // yukaridan asagi dogru sirasiyla calisir

        C04.dortharfitersinecevir("emel");



    }

    private static void ikisayitopla(int a, int b) {
        System.out.println("verilen iki sayinin toplami : " + (a + b));
    }
}
