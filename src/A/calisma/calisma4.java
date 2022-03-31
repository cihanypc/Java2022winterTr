package A.calisma;

import java.util.Scanner;

public class calisma4 {

    public static void main(String[] args) {

        // ) Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        // “emekli olamazsin,calismalisin”,
        // 65’e esit veya buyukse “Emekli olabilirsin” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz :");
        int yas = scan.nextInt();

        if (yas >= 65) {
            System.out.println("cok calistin emeklisin");
        } else {
            System.out.println("emekli olamazsin goccuuum ");
            System.out.println(65 - yas + " " + "yil daha calis kole");
        }


    }
}
