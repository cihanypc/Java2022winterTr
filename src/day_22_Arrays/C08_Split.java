package day_22_Arrays;

public class C08_Split {
    public static void main(String[] args) {
        // verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun

        String cumle = " nerede o hello world yazdiramayan ogrenciler";
        String harf = "e";

        harfkackerekullanilmis(cumle, harf);


    }

    private static void harfkackerekullanilmis(String cumle, String harf) {
        int sayac = 0;

        String karakterler[]=cumle.split("");
        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }
        }

        System.out.println("aradiginiz " + harf+" verilen cumle de "+ sayac+ " kullanilmis");
    }
}
