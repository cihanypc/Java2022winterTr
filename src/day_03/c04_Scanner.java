package day_03;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);// esitligin saginda yeni bir Scanner olusturulur
        // olusturulan bu scanner scan veriableina assign edilir.
        // scan veriable ismidir istenilen isim verilir


        System.out.println("lutfen isminizi giriniz");

       // String kullaniciIsmi=scan.next();// scan.next methodu ilk bosluga kadar olan kismi algilar

        String kullaniciIsmi=scan.nextLine();

        System.out.println("kullanicinin girdigi isim :"+kullaniciIsmi);

        // nextline methodu tum satiri algilar



    }
}
