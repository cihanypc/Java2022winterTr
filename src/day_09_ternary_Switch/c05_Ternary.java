package day_09_ternary_Switch;

public class c05_Ternary {
    public static void main(String[] args) {

        // bazen ternary deki iki sonucun data turleri farkli olabilir
        // verilen sayi 100' den buyukse sayinin karesini alip yazdiralim
        // 100' den kucukse "sayi 100 den buyuk olmali " yazdirin
        // bir ternary olusturalim

        int sayi = 150;
        // tenary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degisken atamaliyiz
        // eger sonuclar data turundeyse
        // atama yapacigimiz veriable in data turu tek olacagindan
        //atama yapamayiz
        //SADECE direk yazdirabiliriz
        System.out.println((sayi>100? sayi*sayi: "sayi 100 den buyuk olmali "));

        // sayi>100? sayi*sayi: "sayi 100 den buyuk olmali
    }     // calismayan kod basina yazdirma komutu getirilince calisir

}
