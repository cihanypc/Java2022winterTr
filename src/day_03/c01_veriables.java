package day_03;

public class c01_veriables {

    public static void main(String[] args) {

        String okulismi = "Yildiz koleji";
        System.out.println(okulismi);

        char ilkharf;
        ilkharf = 'h';
        System.out.println(ilkharf);

        int sayi = 10, sayi2 = 20;
        System.out.println(sayi + sayi2);


        String isim = "Cihan";
        String soyisim = "yildiz";
        System.out.println("isminiz :" + isim);
        System.out.println("soyisminiz :" + soyisim);


        short sayi3 = 20;
        double sayi4 = 30;
        System.out.println(sayi3 + sayi4);//50.0
        //double demek virgullu sayi demektir
        //System.out.println("iki sayinintoplami :" + (sayi3 + sayi4));
        // toplamini almasi icin islem ayri parantez icine alinir

        int sayi5 = 20;
        char harf = 'a';
        System.out.println(sayi5 + harf);//117

        //char data turlerindeki matematiksel islemlerde kullanilir
        // o char degerinin ASCII karsiligi ile carpilir


        int sayi6 = 'a';
        System.out.println(sayi6);//97


    }


}
