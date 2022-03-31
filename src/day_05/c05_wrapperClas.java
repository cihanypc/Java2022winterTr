package day_05;

public class c05_wrapperClas {
    public static void main(String[] args) {

        short sayi1=20;
        Short sayi2=30;
        sayi1=sayi2;
        // wrapper clas ile ayni isimdeki primitive data turu arasinda gecis olabilir

        System.out.println(sayi1); //30

        System.out.println(Short.MAX_VALUE); //32767
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.BYTES); // 2 byte = 16 bit



    }
}
