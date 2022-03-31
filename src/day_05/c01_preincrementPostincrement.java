package day_05;

public class c01_preincrementPostincrement {
    public static void main(String[] args) {

        int sayi = 10;
        sayi++;
        System.out.println(sayi);//11

        sayi++;
        System.out.println("pre-incrementden once" + sayi); //12
        // iki farkli satirda yaptigim islmei tek satirda yaparsam
        //java iki islemdem once hangisini yapacagini bilmek ister
        //once artitip sonra yazdirirsak java yeni degeri yazdirir
        // once yazdirip sonra artirirsak java eski degeri yazar

        System.out.println("pre-incrementten sonra" + ++sayi); //13once artir sonra yazdir
        System.out.println("pre-incrementten sonra" + sayi); //13


        System.out.println("post-increment satirinda " + sayi++);//13 yazdir sonra artir
        System.out.println("pre-incrementten sonra" + sayi);//14


        /* pre increment = sout yazip sayidan once ++ yapmak demektir
        java once artirir sonra yazdirir.
        pot-incremet te ise yazdirdirktan sonra artirir.artirma islemini burda yapar ama yazdirmaz
        bi sonraki islemi artirilmis sayiyi baz alir.

         */





    }
}
