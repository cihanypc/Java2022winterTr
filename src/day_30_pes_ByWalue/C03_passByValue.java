package day_30_pes_ByWalue;

public class C03_passByValue {
    public static void main(String[] args) {

        double etiketFiyati = 100;

        yuzdeOnindirimYap(etiketFiyati);
        yuzdeOnindirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra main method da etiket fiyati : " + etiketFiyati);


    }

    public static void yuzdeOnindirimYap(double etiketFiyati) {

        etiketFiyati = etiketFiyati * 0.90;
        System.out.println("Sizin icin indirimli fiyatimiz : " + etiketFiyati);

    /*
        java pass by value bir proglamlama dilidir
        yani bir primitive variable i argument olarak bir methoda yollarsaniz
        java o veriable i degil degerini(Value ) method a aktarir (pass)
    */
    }
}
