package day_20_scopeArrays;

public class C01_Instance {
    int sayi;
    String bransismi = "Java";
    boolean okulacikmi;

    public static void main(String[] args) {

        /*  sayi=10 sayi veriable'i static olmadigi icin main method dan direk kullanilmaz
        instance veriable'lara static methodlardan ulasabilmek icin obje olusturmamiz gerekir
        instance veriable' la rmain method didinda olusturulur.
         */

        C01_Instance obj1 = new C01_Instance(); // class isminden diger veriable' lara ulasabiliriz
        System.out.println(obj1.sayi); //0  // sayi instance veriable' i deger atanmadigi icin 0 yazdirir.
        obj1.sayi = 10;
        System.out.println(obj1.sayi); //10    // yazdirilan deger basindaki ture gore sonuz verir. str str verir char char verir
        obj1.bransismi = "sql";
        System.out.println(obj1.okulacikmi); // False   burada boolean bir sonuc verir false yazdirir.

        // 1 obje ye deger atamasi var mi?
        // 2 instance deger var mi?
        // 3 defoult deger verir


        C01_Instance obj2 = new C01_Instance();
        System.out.println(obj2.sayi);  // 0
        System.out.println(obj2.okulacikmi); // java

        obj1.okulacikmi = true;

        System.out.println(obj2.okulacikmi);//

    }
}
