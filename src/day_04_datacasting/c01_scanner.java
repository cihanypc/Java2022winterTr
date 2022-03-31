package day_04_datacasting;

public class c01_scanner {

    public static void main(String[] args) {

        boolean dogrumu=true;
      //  String str=dogrumu; // sol string sag boolean olunca kabul etmez

        byte sayi1= 44;
        System.out.println(sayi1); //44

        short sayi2=sayi1; //esitligin sonu short sayi isie byte oldugu halde java itiraz etmez
                    //deger olarak atan deger turu veriable data turunden kucuk oldugu ivin java itiraz etmez

        System.out.println(sayi2); //44


        double sayi3=sayi2;

        //                    //deger olarak atan deger turu veriable data turunden kucuk oldugu ivin java itiraz etmez

        System.out.println(sayi3); //44.0 double oldugu icin virgul ekler




    }
}
