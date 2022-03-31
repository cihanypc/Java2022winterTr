package A.calisma;

import java.util.Scanner;

public class calısma10 {
    public static void main(String[] args) {
        /* Kullanicidan SDET kisaltmasindaki
        harflerden birini yazmasini isteyin.Kullanici
        S girerse “Software”
        D girerse “Developer”
        E girerse “Engineer”
        T girerse “In Testing” yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("ltfen bir harf giriniz");
        String harf= scan.next();

        switch (harf){
            case "S" :
                System.out.println("software");
                break;
            case "D":
                System.out.println("Developer");
                break;
            case "E":
                System.out.println("Engineer");
                break;
            case "T":
                System.out.println("In Testing");
                break;
            default:
                System.out.println("Lutfen S,D,E,T harflerinden birini giriniz ");

        }

    }
}
