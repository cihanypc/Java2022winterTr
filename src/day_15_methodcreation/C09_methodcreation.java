package day_15_methodcreation;

import java.util.Locale;

public class C09_methodcreation {
    public static void main(String[] args) {

        /* kullanicidan isim soyisim kkno alin
        isim soyismin ilk harfleri buyuk digerlerini yildizli yazin
        kkno nun son 4 hanesi haric yildiz yapin
         */
        String isim = "cihan";
        String soyisim = "yapici";
        String kkno = "1234567891238563";

        // eger bir method da bir islem yapmasini ve yaptigi islemi bize getirmesini istersek
        // return type void degil, bize getirecegi data turunde olmalidir.


        String gizlenmisisimsoyisim = isimSoyisimgizle(isim, soyisim);
        // bize isim ve soyismin gizlenmis halini getrimesini istiyoruz
        // bekledigim donus String olur

        System.out.println(gizlenmisisimsoyisim);

        String gizlenmiskkno=kredikartgizle(kkno);

        System.out.println(gizlenmiskkno);


    }

    private static String kredikartgizle(String kkno) {
        String yenikkno = "**** **** **** " + kkno.substring(12);
        return yenikkno;
    }

    public static String isimSoyisimgizle(String isim, String soyisim) {
        String yeniisim = isim.substring(0, 1).toUpperCase(Locale.ROOT) + // ilk harf alinip buyuk harfe cevrildi
                isim.substring(1).replaceAll("\\S", "*"); // geriye kalan harflerin yerine * getirildi

        String yenisoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");
        // method olusturmada 3. adim method calisinca sadece bir sey mi yazdiracak
        // yoksa bize data mi dondurecek buna karar vermektir.
        // bu soru da gizlenmis isim soyisim dondurmesi istendiginden return type i void degil
        // String sectik ve methodun sonuna return edilecek datayi yazdik.
        return yeniisim + " " + yenisoyisim;
    }
}
