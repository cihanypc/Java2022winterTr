package practice;

import java.util.Scanner;

public class day1_practice3 {
    public static void main(String[] args) {

        /*

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("ehliyetiniz var ise 1 yok ise 0 yaziniz");
        int ehliyet = scan.nextInt();
        System.out.println("hizinizi giriniz");
        int hiz = scan.nextInt();

        if (ehliyet == 1) {
            if (hiz < 0) {
                System.out.println("hizinizi hatali girdiniz");
            } else if (hiz >= 55 && hiz < 75) {
                System.out.println("100$ cezalisiniz");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("150$ cezalisiniz");
            } else if (hiz >= 85 && hiz < 94) {
                System.out.println("320$ cezalisiniz");
            } else if (hiz >= 95) {
                System.out.println("500$ cezalisiniz");
            } else {
                System.out.println("hiz sinirinda seyahet ediyorsunuz");
            }
        }else if (ehliyet == 0) {
            if (hiz < 0) {
                System.out.println("hizinizi hatali girdiniz");
            } else if (hiz >= 55 && hiz < 75) {
                System.out.println("300$ cezalisiniz");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("350$ cezalisiniz");
            } else if (hiz >= 85 && hiz < 94) {
                System.out.println("520$ cezalisiniz");
            } else if (hiz >= 95) {
                System.out.println("700$ cezalisiniz");
            } else {
                System.out.println("hiz sinirinda seyahet ediyorsunuz ancak ehliyetsiz oldugunuz icin cezaniz 200$");
            }

            } else {
                System.out.println("agam ehliyet var mi");
            }
        }
    }
