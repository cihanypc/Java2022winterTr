package day_12_StringManupulation;

import java.util.Scanner;

public class c06_replaceAll {
    public static void main(String[] args) {

        // kullanıcıdan ısım soyısım bılgısı alıp
        // butun harflerı * yapalım

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi ve soy isminizi yaziniz : ");
        String isimSoyisim = scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));


    }

}
