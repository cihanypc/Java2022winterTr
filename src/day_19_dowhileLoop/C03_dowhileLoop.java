package day_19_dowhileLoop;

public class C03_dowhileLoop {
    public static void main(String[] args) {

        //kullanicidan pozitif tam sayi alip
        // while loop ile sayidan  kucuk pozitif tamsayilari yazdiralim

        int input = 3;

        int sayi = 1;
       // int sayac = 1;
        while (sayi < input) {
            System.out.println(sayi);
        //    sayac++;
            sayi++;
        }
       // System.out.println("sayac : " + sayac);

        // ayni soruyu dowhile ile yapalim

        sayi=1;

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<input);

    }
}
