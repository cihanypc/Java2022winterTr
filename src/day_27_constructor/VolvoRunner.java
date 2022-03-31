package day_27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {

        Volvo araba1= new Volvo();
        System.out.println(araba1.marka); // Volvo
        araba1.yakit="Dizel";
        araba1.elektriklimi=false;
        System.out.println(araba1.maxHiz);// 240


        System.out.println(araba1.toString());  // Model : null Yakit : Dizel maxHiz : 240


        Volvo araba2= new Volvo();
        araba2.yakit= "elektrikli";
        araba2.elektriklimi=true;
        araba2.model="XC90";
        System.out.println(araba2.toString()); // Model : XC90 Yakit : elektrikli maxHiz : 240

    }
}
