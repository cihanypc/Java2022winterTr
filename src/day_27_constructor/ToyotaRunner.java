package day_27_constructor;

public class ToyotaRunner {
    public static void main(String[] args) {

        Toyata t1 = new Toyata();
        System.out.println(t1.marka); // Toyota
        System.out.println(t1.tekersayisi); // 4
        System.out.println(t1.model); // null

        t1.model = "Corolla";
        t1.yakit = "benzin";
        t1.yil = 2022;

        System.out.println("T1 model : "+ t1.model + ", yakit : "+t1.yakit+ ", yil : "+t1.yil);


    Toyata t2=new Toyata();
    System.out.println(t2.model); // atama yapilmadigi icin null yazdirir

    t2.model="Yaris";
    t2.yakit = "Dizel";
    t2.yil = 2021;

    System.out.println("T2 model : "+ t2.model + ", yakit : "+t2.yakit+ ", yil : "+t2.yil);


    }
}
