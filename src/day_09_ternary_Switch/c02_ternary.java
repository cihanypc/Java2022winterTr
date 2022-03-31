package day_09_ternary_Switch;

import java.util.Scanner;

public class c02_ternary {
    public static void main(String[] args) {

        // ternary ile yapilan islemler if else ile de yapilabilir.
        //if else eyerine ternary tercih etme sebebi yapinin basit ve anlasilabilir olmasidir
        //ternary icerisinde kompleks kodlar olmaz
        //sadece sonuc veya bizi sonuca goturenbasit islemler olabilir

        // kullanicidan bir tam sayi alalim tek mi cift mi yazdiran kod yazin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cift");

        }else {
            System.out.println("sayi tek");



            // ternary il yapilan
            System.out.println(sayi%2==0 ? "sayi cift": "sayi tek");

        }
    }
}
