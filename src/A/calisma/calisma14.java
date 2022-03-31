package A.calisma;

import java.util.Scanner;

public class calisma14 {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyadiniz giriniz");
        String isim = scan.next();
        String soyisim = scan.next();

        String isimsoyisim = isim.concat(soyisim);
        isimsoyisim = isim.concat(" ").concat(soyisim);
        System.out.println(isimsoyisim);
    }
}
