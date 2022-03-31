package day_19_dowhileLoop;

public class C01_whileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin
        //bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekleyin

        int input = 52;
        // for loop ile de yapilabilir

        int bolen = 1;
        int sayac = 0;

        while (bolen <= input) {

            if (input % bolen == 0) {
                System.out.println(bolen + " ");
                sayac++;

            }
            bolen++;
        }
        System.out.println(" ");
        System.out.println(input + "sayisini bolen " + sayac + " adet sayi vardir");


    }
}
