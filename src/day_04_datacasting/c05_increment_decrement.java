package day_04_datacasting;

public class c05_increment_decrement {

    public static void main(String[] args) {

        int sayi = 20;
        System.out.println(sayi + 10); //30
        System.out.println(sayi); // 20 atama yapilmadigi icin burda sayiyiy ilk asyi olarak verir

        sayi = sayi + 10;
        System.out.println(sayi);

        System.out.println(sayi = sayi += 10); // 40 burada hem atama hemde artirma yapildi

        System.out.println(sayi); // 40 bi onceki islemde atama yapildigi icin burda da toplamini verir
        System.out.println(sayi += 10); // 50 sayinin degeri hem 10 artacak hemde yeni deger atanmis olacak
        //bir veriableinin degerini kalici olarak artirmak veya azaltmak isterseniz assignment sarttir

        System.out.println("20.satir : " + sayi++); //50
        System.out.println("21.satir : " + sayi); // 51

        System.out.println("23.satir : " + ++sayi);//52
        System.out.println("24.satir : " + sayi++);//52

    }
}
