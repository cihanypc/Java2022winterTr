package practice;

import java.util.Scanner;

public class day3_practice4atm {
    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* bakiye baslangic bakiyesi 1000 tl ogrenme para yatirma ve cekme cikis islemlerinin yapildigi
        bir atm oop method  create ediniz
         */
        System.out.println("    ****    ");
        System.out.println("    ATM'ye hos geldiniz  :-)    ");
        System.out.println("Bakiye sorgulama : 1\nPara cekme : 2\nPara yatırma : 3\ncıkıs : 4 ");

        secim();


    }

    private static void secim() {
        System.out.println("yapacaginiz islemi seciniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                bakiyesorgulama();
                break;
            case 2:
                paracek();
                break;
            case 3:
                parayatir();

                break;
            case 4:
                cikis();
                break;
        }
    }

    private static void parayatir() {
        System.out.println("yatirmak istediginiz miktari giriniz");
        int yatacakmiktar = scan.nextInt();
        bakiye+=yatacakmiktar;
        System.out.println("paraniz hesaba eklendi");

        System.out.println("***");
        System.out.println("isleme devam etmek istiyorsaniz 1\nisleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();

    }

    private static void paracek() {
        System.out.println("cekeceginiz miktari giriniz : ");
        int cekilecekmiktar = scan.nextInt();
        if (cekilecekmiktar > bakiye) {
            System.out.println("bakiyeniz yetersiz");
        } else {
            bakiye -= cekilecekmiktar;
        }
        System.out.println("***");
        System.out.println("isleme devam etmek istiyorsaniz 1\nisleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();
    }

    private static void bakiyesorgulama() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("***");
        System.out.println("isleme devam etmek istiyorsaniz 1\nisleme devam etmek istemiyorsaniz 0\n tuslayiniz");
        int karar = scan.nextInt();
        if (karar == 1) {
            secim();
        } else cikis();


    }

    private static void cikis() {
        System.out.println("cikisiniz yapildi yine bekleriz");
    }
}
