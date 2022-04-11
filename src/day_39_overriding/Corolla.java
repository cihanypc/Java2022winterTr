package day_39_overriding;

public class Corolla extends Toyota {

    protected String hiz = "Corolla max 200 km hiz yapar";
    protected String yakit = "Corolla benzinli veya elektriklidir";
    protected String model= "Corolla";


    public void motor() {
        System.out.println("Corolla araclar cevreci motor kullanirlar");
    }

    public void yakitTuketimi() {
        System.out.println("Corolla 5.6 lt yakit tuketirler");
    }

    public void vitesSayisi() {
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {
        /*
        data turu ve construtor farkli oldugunda cons  calistigi icin obje cons. oldugu class ozelliklerini tasir
        ancak data turu parent class secildigi icin veriable lar data turunun secildigi class ve onun parent classlarindan
        deger alabilir. data turu parent classlardan secilir

        Methodlar icin ise yine data turunun oldugu classa gidilir ancak direk methodu calistirmadan once
        method Override edilmis mi diye kontrol ederiz.
        Override=ing de Constructor a gore secim yapilir

         */

        Corolla arb1 = new Corolla(); // data turu Corolla

        System.out.println(arb1.hareket);  // araba clasindan alir
        System.out.println(arb1.hiz); // bu classdan alir
        System.out.println(arb1.yakit); // bu classdan alir
        System.out.println(arb1.marka);  // toyota clasindan alir
        System.out.println(arb1.sirketMerkezi); // toyota classindan alir
        System.out.println(arb1.model); // bu classdan alir
        arb1.motor();   // bu classdan alir


        Toyota arb2= new Corolla();  // data turu toyota

        System.out.println(arb2.hareket);  // araba classindan alir
        System.out.println(arb2.hiz);      // toyota classindan alir
        System.out.println(arb2.yakit);    // araba classindan alir
        System.out.println(arb2.marka);    // toyota classindan alir
        System.out.println(arb2.sirketMerkezi); // toyota classindan alir
       // System.out.println(arb2.model);  parent i olmadigi icin cte verir
        arb2.motor(); // cons. bu classda oldugu icin burdan alir
        arb2.garanti(); // toyota classindan alir
        arb2.yakitTuketimi();// bu classdan calsir
        // arb2.vitesSayisi(); data turu olan toyota dan baslayinca boyle bir methot bulunamadi cte verir


        Araba arb3 = new Corolla();   // data turu Araba

        System.out.println(arb3.hareket);  // araba classindan alir
        System.out.println(arb3.hiz);     //  araba clasindan alir
        System.out.println(arb3.yakit);   //  araba clasindan alir
        System.out.println(arb3.marka);   //  araba clasindan alir
       // System.out.println(arb3.sirketMerkezi); // cte verir
        // System.out.println(arb3.model);  // cte verir

        arb3.yakitTuketimi(); // bu classdan calisir
        arb3.motor();  // bu classdan calisir
       //  arb3.garanti(); // aramaya araba classindan baslar o yuzden bulamadigi icin cte verir
       // arb3.vitesSayisi();   cte verir



    }
}
