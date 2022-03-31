package day_17_For_loop;

public class C06_forLoop {
    public static void main(String[] args) {

        // verilen iki harf ve aralarindaki harfleri yazdiran bir kod yaziniz

        char ilkharf = 'c';
        char sonharf = 's';


        for (char i = ilkharf; i <= sonharf; i++) {
            System.out.print(i + " ");
        }

        double baslangic = 10;
        double bitis = 20;
        double artis = 0.2;

        for (double i = baslangic; i <= bitis; i += artis) {
            System.out.print(i + " ");
            // baslangic ve btitis arasinda artismiktari ile olusak tum sayilari yazdirin

        }

    }
}
