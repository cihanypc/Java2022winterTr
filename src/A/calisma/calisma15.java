package A.calisma;

import java.util.Scanner;

public class calisma15 {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("iki kelime giriniz");
        String str1 = scan.next();
        String str2 = scan.next();

        System.out.println(str1 + " " + str2);
        System.out.println(str1.substring(1)+" "+ str2.substring(1));


    }
}
