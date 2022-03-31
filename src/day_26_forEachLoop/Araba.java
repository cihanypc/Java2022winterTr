package day_26_forEachLoop;

public class Araba {
        /* java da her class olusturuldugunda java o class dan
        ileride o classtdan objelere oretmek gerekecegini bilir
        ve biz ozellikle belirtmesekde java her her olusturdugu class a
        bir constructor koyar.

        java nin class olustururken class a koydugu constructor a
        DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

        eger biz gorunuz bir constructor olmasini istersek \
        default constructor ile ayni gorevi goren bir constructor
        olusturabiliriz
        ve ya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
        farkli ozelliklerde constructor lar da olusturabiliriz

        constructorlari  birbirinden farklilastiran tek ayricalik
        kullanilan parametre sayisi ve parametre data turudur

         */

    public Araba() {
        System.out.println("parametresiz constructor calisti");
    }
    /* bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
    iki seye dikkat edilmelidir
    1- constructorlarin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
    2- Caonstructor larin return type i olmaz

    ozetle: cons adi clas ile ayni olmali ve return type i olmamali

     */
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba olustruldu");
    }

    public Araba(int yil){
        System.out.println(yil+ "model araba uretildi");
    }

    public  Araba(int yil,String renk){
        System.out.println(yil + "model "+ renk + " renginde uretildi");
    }
}
