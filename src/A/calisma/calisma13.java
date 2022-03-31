package A.calisma;

import java.util.Scanner;

public class calisma13 {
        /*
    0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
   kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
   cikis "Gecersiz" olmalidir
   NestedIf ve Ternary kullanarak 2 yolla da cozunuz
 */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        double sayi= scan.nextDouble();

        if (sayi>=0 && sayi<=9){
            System.out.println("bu bir rakamdir");
        }else if (sayi>9 ){
            System.out.println("9 dan buyuk sayi girdiniz");
        }else {
            System.out.println("gecersiz sayi girdiniz");
        }


    }
}
