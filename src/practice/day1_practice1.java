package practice;

import java.util.Scanner;

public class day1_practice1 {
    public static void main(String[] args) {

        //kullanicidan aldiginiz koordinat noktasinin
        // hangi bolgede oldugunu yazdiran bir kod yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("X ve Y degerlerini giriniz");

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1.bolge");
        } else if (x < 0 && y > 0) {
            System.out.println("2.bolge");
        } else if (x < 0 && y < 0) {
            System.out.println("3.bolge");
        } else if (x > 0 && y < 0) {
            System.out.println("4.bolge");
        } else if (x != 0 && y == 0) {
            System.out.println("x ekseninde");
        } else if (x == 0 && y != 0) {
            System.out.println("y ekseninde");
        } else {
            System.out.println("orjin 0 noktASI");
        }


    }
}
