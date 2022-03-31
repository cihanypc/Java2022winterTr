package day_15_methodcreation;

public class C07_methodcreation {
    public static void main(String[] args) {

        //  String str="Ali";

        //  stringYazdir(str);
        // hosgeldiniz diyen bir method olusturun

        // hosgeldinYazdir();

        //kapanma mesaji uazan bir method olusturun
        //kapanmaMethodu();


        hosgeldinYazdir();
        //  stringYazdir("Java gun gectikce guzellesiyor");
        //  kapanmaMethodu();

    }

    private static void kapanmaMethodu() {   // private olarak atanir diger claslarda
        // kullanabilmek icin public yapilmasi gerekir
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldiniz");
        stringYazdir("Boylede guzel olur");

    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
