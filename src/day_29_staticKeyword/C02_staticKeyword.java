package day_29_staticKeyword;

public class C02_staticKeyword {
    public static void main(String[] args) {
        /* baska class daki static class uyelerine ulasabilmek icin
        sadece clasismi.statticuyeisme yazmamaiz yeterlidir

         */

        System.out.println(C01_static.okultelefonu); // "4151661166"
        C01_static.okultelefonu = "654646549841";
        System.out.println(C01_static.okultelefonu);// "654646549841";

        /* baska class dakim static olmayan class uyelerine ancak o class dan
        obje olusturarak ulasilabilir.
        ve obje ile yapilan atamalar sadece o obje icin gecerli olur
         */

        C01_static obj1=new C01_static();
        C01_static obj2=new C01_static();

        System.out.println(obj2.okulismi);  // yildiz koleji

        obj2.okulismi="sabir koleji"; // sadece obj2 icin degisiklik olur

        System.out.println(obj1.okulismi); // yildiz koleji


    }
}
