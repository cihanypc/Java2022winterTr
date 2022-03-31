package day_05;

public class c02_preincrementPostincrement {
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;

        sayi2 = sayi1++; // sayi1 artirili sayi2 sayi1 in onceki degerini alir

        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);

        //sayi1 = 11  sayi2 = 10 sayi3 = 30

        sayi3 = ++sayi1;
        System.out.println(sayi1 + "," + sayi2 + "," + sayi3);

        //once artirma yapilir sonra yazdirilir
        //once sayi1 artirilir 11 iken 12 olur
        //sayi3 te 12 olur
        // sayi1= 12 sayi2 = 10 sayi3= 12

        System.out.println(sayi3++); // once yazdiracagi icin 12 yazdirir
                                    //sonraki islemde artirip yazdiracagi icin 13 olur


        System.out.println(--sayi2);// once azaltip sonra yazdirdigi icin sayi2=9 olur




    }
}
