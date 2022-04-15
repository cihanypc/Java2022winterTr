package day_42_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_FileInputStream {
    public static void main(String[] args) {
        String dosyayolu = "src/day_41_exceptions/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
            int k = 0;
            while ((k = fis.read()) != -1) {
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        exciptionlar icin de parent child iliskisi mevcuttur
        eger bir kod icin birden fazla exrption olusma ihtimali varsa oncelikle
        olasi exceptionlar parent child iliskisi tasiyor mu bakmamiz gerekir.
        eger parent child iliskisi yoksa istedigimiz sirada catc cumleleri olusturabiliriz.



        eger parent child iliskisi varsa
        sadedce parent exception i yazabiliriz
        veya ikisini yazmak istersek child i once parent i sonta yazmaliyiz



         */


        /*
        alti kirmizi cizili her kod cte degildir.
        Java syntax hatalarini derleme esnasinda (compile) farkeder ve altini cizer
        ancak compile time exception kavrami da hayatimiza girdi
         */
    }
}
