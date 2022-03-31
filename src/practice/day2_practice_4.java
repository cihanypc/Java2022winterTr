package practice;

import java.util.Scanner;

public class day2_practice_4 {
    public static void main(String[] args) {

    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("gun giriniz : ");
        String gun=scan.next();

        switch (gun){
            case "pazartesi" :
            case "sali":
                System.out.println("Java ders gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum ders gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL ders gunleri");
                break;

            default:
                System.out.println("izin gunu");

        }

    }
}
