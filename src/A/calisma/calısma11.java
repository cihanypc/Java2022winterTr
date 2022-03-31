package A.calisma;

import java.util.Scanner;

public class calısma11 {
     /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Notunuzu giriniz : ");
         int not= scan.nextInt();

         if (not>=90 && not<=100){
             System.out.println("A aldiniz tebrikler");
         }else if (not>=70 && not<90){
             System.out.println("B aldiniz bravo");
         }else if (not>=60 && not <70){
             System.out.println("C aldiniz idare eder");
         }else if (not>=45 && not<60){
             System.out.println("D aldiniz bute girin");
         }else {
             System.out.println("F aldiniz kaldiniz.");
         }


     }
}
