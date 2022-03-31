package day_27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {

        /*  her obje olustruldugunda model yakit gibi degerleri tek tek atama yapmak istemiyorsak


         */
        Volvo arb1 = new Volvo("XC60", false, 2023, "Benzin");
        System.out.println(arb1.toString()); // Model : XC60 Yakit : Benzin maxHiz : 240

        System.out.println(arb1);

        Volvo arb2= new Volvo( "Xc50", true,2015,"elektrikli");
        System.out.println(arb2); // Model : Xc50 Yakit : elektrikli maxHiz : 160

    }
}
