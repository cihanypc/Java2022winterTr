package A.calisma;

import java.util.Scanner;

public class calisma16 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girinniz");
        String str = scan.next();

        if(str.length()>=3){
            System.out.print(str.substring(str.length()-2)+str.substring(str.length()-2)+str.substring(str.length()-2));
        }else {
            System.out.println(str);
        }




    }
}
