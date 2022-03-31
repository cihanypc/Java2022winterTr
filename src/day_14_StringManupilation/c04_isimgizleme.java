package day_14_StringManupilation;

import java.util.Locale;

public class c04_isimgizleme {
    public static void main(String[] args) {


        /* kullanicidan isim soyisim kkno alin
        isim soyismin ilk harfleri buyuk digerlerini yildizli yazin
        kkno nun son 4 hanesi haric yildiz yapin
         */
        String isim = "cihan";
        String soyisim = "sadasdici";
        String kkno = "1234567891238563";

        String yeniisim = isim.substring(0, 1).toUpperCase(Locale.ROOT) + // ilk harf alinip buyuk harfe cevrildi
                isim.substring(1).replaceAll("\\S", "*"); // geriye kalan harflerin yerine * getirildi

        String yenisoyisim = soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        String yenikkno= "**** **** **** " + kkno.substring(12);

        System.out.println("isim soyisim : "+ yeniisim + " " + yenisoyisim + "\nkart no : " + yenikkno);
    }
}
