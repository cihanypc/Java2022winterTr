package day_11_StringManipulation;

import java.util.Scanner;

public class c05_indexof {
    public static void main(String[] args) {

        String str1 = "java bir baska guzel valla cok guzel";
        // istersek char olarak dondurur
        System.out.println(str1.indexOf('j')); //0

        //istersek bir harf yada metin olarak verdigimiz stringin indexini dondurur
        System.out.println(str1.indexOf('l')); //19

        System.out.println(str1.length() - 1); //19
        System.out.println(str1.indexOf("aska")); // 10

        //ayni harften birden fazla varsa buldugu ilk dogru eslesmeyi yazdirir
        System.out.println(str1.indexOf("b")); //5

        System.out.println(str1.indexOf('b', 5));
        // bu methodda java aramaya fromindex olarak yazdigimiz index den baslar
        // (inclusive)

        // verilen stringdeki ikinci a harfinin index ini bulalim

        int ilkindex = str1.indexOf('a'); // 1
        System.out.println(str1.indexOf('a', ilkindex + 1)); // 3

        // verilen stringdeki ikinci b harfinin index ini bulalim

        int ilkindex1 = str1.indexOf('b'); // 1
        System.out.println(str1.indexOf('b', ilkindex1 + 1)); // 9

        System.out.println(str1.indexOf("guzel", 20));

        //string de olmayan bir harf aratsak
        System.out.println(str1.indexOf("y")); // herzaman int cevap verdigi icin
        // int turunden yok cevabi vermesi gerekir bu yuzden -1 yazdirir


        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa kabul edildi yazin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen mail adresinizi yazin : ");
        String mail= scan.next();
        if (mail.indexOf("@")==(-1)){
            System.out.println("gecersiz");
        }else {
            System.out.println("mailiniz kabul edildi");
        }

        /* indexof methodu icerisine yazilan string veya charin metinde hangi
        index te oldugunu bize dondurur eger aradigimiz metin veya char
        yoksa alamadiginin delili olarak  -1 dondurur.
         */
    }
}
