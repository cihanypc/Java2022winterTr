package day_38_inheritanceOverriding;

public class Ustabasi extends Isci {
    public String statu = "Usta basi";
    public String haklar = "Usta basi hafta da birgun extra tatil hakkina sahiptir.";


    public void mesai() {
        System.out.println("Ariza varsa usta basi ekstra ucret almadan calisir");
    }

    public void maasHesapla() {
        System.out.println("Usta basi  30 gun * 8 saat *12 euro =" + (30 * 8 * 12) + "Euro maas alir.");
    }

    public static void main(String[] args) {
        /*
        icinde oldugumuz calss dan klasik  haliyle bir obje olusturursak o obje ile cagirdigimiz
        method ve veriable larda java once icinde bulundugumuz classa bakar
        aradgimiz icinde oldugumuz class da varsa bize onu getirir.
        Yoksa parent classlara giderek ilk buldugunu alir.

         */
        Ustabasi yasin = new Ustabasi();

        System.out.println(yasin.statu);  // Usta basi
        System.out.println(yasin.haklar);  // Usta basi hafta da birgun extra tatil hakkina sahiptir.
        System.out.println(yasin.ikramiye); // isciler yilda bir ikramiye alir
        System.out.println(yasin.izin);  //  tum personel yilda 4 hafta izin kullanabilir
        yasin.maasHesapla();
        yasin.mesai();

        /*
        Eger isci olarak ozelliklerini gormek istersek
        Class adini (data turu ) Isci seceriz
         */
        Isci Ahmet = new Ustabasi();
        System.out.println(Ahmet.statu); // Isci
        System.out.println(Ahmet.haklar); // Isciler kidem tazminati alirlar
        System.out.println(Ahmet.ikramiye);  // isciler yilda bir ikramiye alir
        System.out.println(Ahmet.izin);  //  tum personel yilda 4 hafta izin kullanabilir
        Ahmet.maasHesapla();
        Ahmet.mesai();

        /*
        bir objeyi hangi class dan tanimlanirsa o class a ait ozelliklere sahip olur

         */

        Personel adem = new Ustabasi();
        System.out.println(adem.statu); // Personel
        System.out.println(adem.haklar); // Tum personel esit haklara sahiptir
        //  System.out.println(adem.ikramiye);  // cte verir hata verir
        System.out.println(adem.izin);   // tum personel yilda 4 hafta izin kullanabilir
        adem.maasHesapla();
        adem.mesai();

        /*
        Personel adem = new Ustabasi();  bu bir ustabasi objesidir

        Usta basi  30 gun * 8 saat *12 euro =2880Euro maas alir.
        Ariza varsa usta basi ekstra ucret almadan calisir


        Personel adem = new PErsonel();  bu bir personel objesidir
         */

        /*
        Personel adem = new Ustabasi();
         adem in data turu personeldir. boylece biz ademi ne olarak isimlendirdigimizi bilebiliriz.
         ancak ben ademin ustabasi oldugunu biliyorum cunku constructor i ustabasi
         ama bu yazim formati ile adem in tum personel ile birlikte sahip oldugu ortak ozellikleri vurgulamak istiyorum

         bu kullanim seklinde olsuturulan obje data turu olarak secilen class ve parent classlarindaki
         veriable lari kullanabilir.

         */
    }
}
