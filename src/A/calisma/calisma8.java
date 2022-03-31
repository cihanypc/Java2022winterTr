package A.calisma;

import java.util.Scanner;

public class calisma8 {
    public static void main(String[] args) {

        /*  Kullanicidan bir tamsayi alin ve
         sayi 10’dan kucukse “Rakam” , 100’den kucukse “iki
basamakli sayi”degilse “uc basamakli veya daha buyuk sayi” yazdirin

   */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi < 10) {
            System.out.println("Rakam");
        } else if (sayi < 100) {
            System.out.println("iki basamakli sayi");
        } else {
            System.out.println("uc basamakli veya daha buyuk sayi");
        }
    }
}
