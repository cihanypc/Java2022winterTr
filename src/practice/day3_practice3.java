package practice;

import java.util.Scanner;

public class day3_practice3 {
    public static void main(String[] args) {

        /*  string girildiginde ilk iki karakteri haric string return eden java method yaziniz
        ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
        ornek input:  goat
                     photo
                      ghost
                     kalem
       output:      gat
                    hata
                    ghost
                    lem
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz : ");
        String kelime = scan.next();
        System.out.println(ilkikisiz(kelime)); // method koludur
    }

    private static String ilkikisiz(String kelime) {
        String kalanharfler="";
        if (kelime.startsWith("gh")){
            kalanharfler=kelime;
        }else if (kelime.startsWith("g")){
            kalanharfler=kelime.charAt(0)+kelime.substring(2);
        }else if (kelime.charAt(1)=='h'){
            kalanharfler=kelime.substring(1);
        }else {
            kalanharfler=kelime.substring(2);

        }
        return kalanharfler;

    }


}
