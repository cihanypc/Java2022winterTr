package day_12_StringManupulation;

public class c05_replace {
    public static void main(String[] args) {

        String str = "bugun ne cok sey ogrendik";
        // bu cumledeki spaceleri yok edin
        //cumledeki karakter sayisini bulunuz

        System.out.println("space olmadan karakter sayisi :" + str.replace(" ", "").length());

        // atama yapilmadigi surece orjinal string kalici olarak degismez
        // saddece o satir icin degisiklik yazilip sonuc yazdirilir

        System.out.println(str);

        str = str.replace("bugun", "yarin");
        str = str.replace("ogrendik", "ogrenecegiz");
        System.out.println("kalici degisiklikten sonra :\n" + str);
    }

}
