package day_20_scopeArrays;

public class C02_StaticVeriables {

    /* instance veriable lar obje ye baglidir ve her obje farkli degerler alabilir.
    ogrenci notlari ve ogretmen branslari gibi
    bir objeye ait bir veriable nin son degerini bulmak icin sadece o objeyi dikkate aliriz

    static veriable lar ise  clas veriable olarak tanimlanir
    ve tum class uyeleri icin aynidir. okul ismi okul mududurunun adi gibi
    eger static veriable nin degeri degistirilirse herkes icin degistirilir.

     */

    static String okulismi = "Yildiz koleji";
    static int okulno;
    static boolean okulacikmi;

    public static void main(String[] args) {
        System.out.println(okulismi); //  Yildiz koleji
        System.out.println(okulno);  // 0   okulno suna bir atama olmadigi icin 0 yazdirir
        okulno=449;
        System.out.println(okulno); // 449 burda bi onceki satirda atanan degeri yazdirir.
        System.out.println(okulacikmi);  // False

        Staticmethod(); // 200 main methodun icinde calistirildigi icin 200 yazdirir
        System.out.println(okulno); // 200 asagida okul no degistirildigi icin en son atanan degeri yazdirir.


    }

    public static void Staticmethod(){

        okulno=200;
        System.out.println(okulno); // 200
    }
}
