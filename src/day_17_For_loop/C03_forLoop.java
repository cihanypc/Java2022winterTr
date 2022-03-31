package day_17_For_loop;

public class C03_forLoop {
    public static void main(String[] args) {

        //10 ile 30 arasindaki sayilari aralarinda virgul olarqak ayni satirda yazdirin

        for (int i = 10; i <= 29; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(30);

        int baslangic = 10;
        int bitis = 30;

        for (int i = baslangic; i <=bitis ; i++) {

            if (i<bitis){
                System.out.print(i+", ");
            }else {
                System.out.println(i);
            }

        }

    }
}
