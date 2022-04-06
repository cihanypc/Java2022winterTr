package day_35_inheritance;

public class isci extends personel {

    public static void main(String[] args) {

        personel objpers = new personel();
        objpers.isim = "Cihan";
        objpers.soyisim = "Yapici";
        objpers.adres = "Groningen";


        isci objisci = new isci();
        objisci.isim = "Cihan";
        objisci.soyisim = "Yapi";
        objisci.adres = "Istanbul";


    }
}
