package haftalik_tekrar_practice;

public class practice3 {
    public static void main(String[] args) {

        // byte short long int double float
        // veri tiplerinin max ve min degrlerini yazdiriniz

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);

        byte byteMin= Byte.MIN_VALUE;
        System.out.println("byteMin = " + byteMin);

        // max ve min degerlerini almak icin
        // esittirden sonre . ve Buyuk harfle baslanip
         // soutv formati secilir

        short shortMax= Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        short shortMin= Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin);


        int intMin= Integer.MIN_VALUE;
        System.out.println("intMin = " + intMin);

        int intMax= Integer.MAX_VALUE;
        System.out.println("intMax = " + intMax);

        long longMin= Long.MIN_VALUE;
        System.out.println("longMin = " + longMin);



        // her veri turu ile bir tane olmak uzere 4 degisken olustrun
        //(float double char boelean)
        // degiskenler icin anlamli isimler kullanip yazdirin

        float laptopFiyati=999.99f; // sonuna f eklenir
        double kilometre= 579.6;
        char cinsiyet= 'E';   // herzaman tek karakter atanir
        boolean dogrumu= true;

        System.out.println(laptopFiyati);
        System.out.println("laptopFiyati = " + laptopFiyati);
        // bu formatta da yazilabilir bir farki yoktur
        System.out.println(kilometre);
        System.out.println(cinsiyet);
        System.out.println(dogrumu);


    }
}
