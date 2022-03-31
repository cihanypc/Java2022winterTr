package day_13_stringManipulation;

public class c01_substring {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        System.out.println(str.substring(5)); // 5. karakterden baslayarak kalani yazdirir

        // yukarida ki metni kullanarak mehmet hoca ile it cok guzel

        System.out.println(str.replace("java", "mehmet hoca "));
        System.out.println("mehmet hoca" + str.substring(5));
        System.out.println(str.substring(9)); // yazilan indeks inclusive
        // IT cok guzel
        // eger bir indeksten sona kadar olan parcayi degil belirli
        // bir parcayi almak istersek iki parametre yazmak gerekir
        // str.substring(baslangicindexi, bitisindexi)
        // baslangic indexi inclusive dir(dahildir)
        // bitis indeksi eclusive dir

        System.out.println(str.substring(0, 5)); // Java

        System.out.println(str.substring(0, 1)); // J

        System.out.println(str.substring(5, 6)); // i

        str = "java gun gectikce guzellesiyor";

        System.out.println(str.substring(7, 7)); // java soldan saga dogru okur
        // dolayisiyla birsey yazdirmaz
        //System.out.println(str.substring(5,2)); // hata verir
        // bitis indexi baslangic indexinden kucuk olama

        System.out.println(str.substring(str.length() - 1)); // son harfi verir

        System.out.println(str.substring(str.length() - 5));// siyor

        System.out.println(str.substring(str.length()));// son harften sonraki kismi yani hiclik verir



    }
}
