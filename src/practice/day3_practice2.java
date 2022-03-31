package practice;

import java.util.Scanner;

public class day3_practice2 {
    public static void main(String[] args) {

        // kullanicidan bir isim isteyin ve isim saddece 3 harfli olmalidir
        // ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz
        // test data : ali,eme, all

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz : ");
        String isim = scan.nextLine();
        char c1 = isim.charAt(0);
        char c2 = isim.charAt(1);
        char c3 = isim.charAt(2);

        String sonuc= isim.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3)?"girdiginiz isim 3 harfli ve unique karaktere sahip":
                "girdiginiz karakter unique degil") :"girdiginiz 3 harfli degil";

        System.out.println(sonuc);


    }

}
