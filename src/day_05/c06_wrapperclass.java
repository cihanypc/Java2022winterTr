package day_05;

public class c06_wrapperclass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        // verilen stringlerdeki sayilari toplayiniz


        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2)); // 35801
         // string degerlerini toplamak icin yapilan islem

        // Integer.valueOf(str1); degeri sadece sayisal degerler icren stringlerde kullanilir
        // bir tane bile sayi dizisinde sayi disinda  karakter olursa java hata verir.



    }
}
