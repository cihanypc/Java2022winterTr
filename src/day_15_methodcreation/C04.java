package day_15_methodcreation;

public class C04 {
    // main methodolmadan da bir clas olusturulabilir ancak bu clas calismaz sadece depo gorvi gorur baska
    // claslarda kullanilabilecek method ve veriable lari barindirir

    public static void besharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(4) +
                kelime.substring(3, 4) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    public static void dortharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(3) +
                kelime.substring(2, 3) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);
    }

    public static void ucharfitersinecevir(String kelime) {
        String terskelime = kelime.substring(2) +
                kelime.substring(1, 2) +
                kelime.substring(0, 1);

        System.out.println("girdiginiz kelime deki harf sayisi : " + kelime.length());
        System.out.println("kelimenin tersten yazilisi : " + terskelime);


    }
    /* 1 method ismi yazilir
       2 methoda giderken goturmem gerekn veriable varsa bunu methoada eklemeliyim

     */


}

