package day_45_interfaces;

public interface I01_Default_Static {

    /* interface lerde sadece abstract methodlar bulunur

    body si olan concrete bir method olusturmak istedigimizde java cte verir


    ancak java 8 ve uzeri versiyonlarda istisnai olarak
     static veya default olarak tanimlanan methodlarin body si olabilir
    ancak burda kullanilan default keyword u  acces modifier degildir
    cunku interface lerde tum methodlar public ve abstract ti.


    asagidaki ornek te gorulecegi gibi default olarak tanimlanmis
    bir methoda acces modifier olarak public yailabilir.
    (acces modifier yazmasak da java methodu public olrak kabul edecektir)

     */


    void method1();

  //  void method2(){}   itiraz edip cte verir


    public default void method3 (){
        System.out.println("interface deki default method");
    }   // itiraz etmez

    static void method4(){
        System.out.println("interface deki static method");
    }



}
