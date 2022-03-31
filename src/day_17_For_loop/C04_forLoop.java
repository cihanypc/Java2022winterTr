package day_17_For_loop;

public class C04_forLoop {
    public static void main(String[] args) {
        // 4 100 den kucuk bir sayi isyeyin
        // 1 den baslayarak 3 un katlarini yazdirin

        int sayi = 55;

        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
