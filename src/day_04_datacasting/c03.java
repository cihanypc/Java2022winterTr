package day_04_datacasting;

public class c03 {
    public static void main (String[] args ) {

        int sayi1= 8;
        int sayi2 = 4;
        System.out.println(sayi1/sayi2);

        sayi2 = 3;
        System.out.println(sayi1/sayi2);

        sayi1=22;
        System.out.println(sayi1/sayi2);


        sayi1= 4786;
        sayi2=10;

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2); //478.6

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2); //478

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//47

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//4

        sayi1=sayi1/sayi2;

        System.out.println(sayi1/sayi2);//0

        sayi1=4895;
        double sayi3=10;
        //sayi1=sayi/sayi3; iki farkli sayi data turunu isleme koydugumuzda
        // java kucuk olan data turu icin autoWeidening yapar
        //bu islemi dusunersek sayi2/sayi3==> isleminin sonucunu double kabul eder

        System.out.println(sayi1/sayi3);  // 489.5






    }
}
