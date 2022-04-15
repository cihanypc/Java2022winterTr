package day_45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static {
        /*
            bir interface de default veya static olarak tanimlanan ve body'si olan methodlarin override
            edilmesi mecburi degildir.
            eger static olarak tanimlanmissa override edilemez.
        */

    @Override
    public void method1() {
        System.out.println("child class method1");

    }

    public static void main(String[] args) {
        //  interface deki static olarak tanimlanan methodlara static yontemlerle ulasilabilir.
        // interfaceismi.methodismi

        I01_Default_Static.method4();

        C02_Default_Static_Method obj = new C02_Default_Static_Method();
        obj.method1();  // child class daki calisir (bu clas)
        obj.method3();  // parent interface den alir
       // obj.method4();  eski classlarda static bir uyeye static olmayan yollarla da ulasabilirdik
        // ancak interface icerisinde static olarak tanimlanan methoda static olmayan yontemlerle ulasilamaz



    }
}
