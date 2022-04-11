package day_41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02FileInputStream {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        bir kod yazilirken olasi exceptionlar ongorulup exception olustugunda
        java nin ne yapmasini istedigimiz belirtilmelidir.

        1 eger exception olustugunda kodun calismasini devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception u deklare edebiliriz.

        2 eger exception olussada kodun calismaya devam etmesini istiyorsak
        sorun olusturuabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikarabilecek kodu catch bloguna olusabilecek exception'i ve
        olasi exception durumunda java nin ne yapmasini istedigimizi yazabiliriz
         */


        String dosyayolu = "src/day_41_exceptions/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyayolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
