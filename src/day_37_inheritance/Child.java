package day_37_inheritance;

import day_36_inheritance.Parent;

public class Child extends Parent {
    Child() {
        super();
        System.out.println("child class parametresiz cons.");
        /*
        bir  classi child class yaptigimizda parent class daki constructor a ulasmasi gerekir
        bu durumda parent class daki cons.in access modifier i uygun bir modifier yapilmalidir

        ayni package de olmadigi icin parent classi inin basina protected yazmamaiz gerekiyor
        day 36 dan parent cagirdigimiz icin day 36 da parent classinda protected yazildi
         */


    }

    Child(int s) {
        /*
    child class da tum cons. larin ilk satirina java nin yerlestirdigi cons. parametresizdir. yani super classtir
     */
        System.out.println("child class parametreli cons.");
    }

    Child(int sayi1, int sayi2){
        /*
        eger parent class dan parametresiz cons. degil de baska bir cons. calistirmak istersek bunu
        child class daki cons. ilk satirina yazilmalidir.
         */
        super(sayi1,sayi2);
        System.out.println("iki parametreli cons.");
    }

    public static void main(String[] args) {

        Child child = new Child(5,8);
    }


}
