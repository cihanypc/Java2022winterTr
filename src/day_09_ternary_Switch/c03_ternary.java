package day_09_ternary_Switch;

public class c03_ternary {
    public static void main(String[] args) {

        int sayi=540;
        // verilen sayinin 3 veya daha cok basamakli olup olmadigini kontrol edin
        // ve sonucu yazdiran bir tenary olusturun


        String sonuc =sayi>=100 ? "sayi 3 basamakli veya daha buyuk ": "sayi negatif veya 3 basamakli degil";
        //ternary bize sonuc dondurdugu icin
        //ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data turune uygun bir veriable a atama yapabiliriz


        System.out.println("girdiginiz sayi analizi : "+sonuc);
    }
}
