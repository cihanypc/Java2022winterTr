package day_23_multidimensional_arrays;

public class C03_MDarrays {
    public static void main(String[] args) {
        // boyutlari bir array i elementleri girmeden olusturalim
        // bir okul da icin de 24 ogrenci olan 8 sinif vardir

        int arr[][]= new int[8][24];

        // bir ilcede herbirinde 24 ogrencilik , 8 sinif bulunan 5 okul vardir

        int ilce [][][] = new int[5][8][24];

        // bir okulda 3 tane 24 kisilik 2 tane de 22 kisilik sinif vardir

        int sinif24[][]= new int[3][24];
        int sinif22[][]= new int[2][22];

        // Olustururken elementlere atama yaparsak farklı uzunlukla ınner arrayler tanımlanabılır

        int arr1[][] = {{3, 1, 7,5}, {6, 10}};




    }
}
