package day_27_constructor;

public class Cons02 {
    public static void main(String[] args) {
        Cons01 obj1 = new Cons01(); // default constructor devrede

        /*  cons01 hic constructor olusturmazsak java default constructor kullandigindan
        obj1 i uretebiliriz

        ancak biz parametreli ve parametresiz bir constructor yazdigimizda java default
        constructor i siler

         dolayisiyla biz herhangi bir constructor olusturdugumuz da daha once baska claslar
         veya kullanicilarin olusturmus olanilecegi pbjeleri kullanabilmeleri icin

         default constructor in islevini gerceklestirecek parametresiz bir
         constructor olusturmakta fayda var

         */


        Cons01 obj2 = new Cons01("java");
    }
}
