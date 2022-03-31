package day_14_StringManupilation;

public class c03_stringsayitoplama {
    public static void main(String[] args) {
        // string seklinde girilen asagidaki fiyatlarin toplamini bulunuz
        // string str1= "$13.99"
        // String str2 = "$10.55"
        //ipucu

        String str1= "$13.99";
        String str2= "$10.55";
        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        double str1sayi= Double.valueOf(str1);
        double str2sayi= Double.valueOf(str2);

        System.out.println(" ");   // yarim kaldi
    }
}
