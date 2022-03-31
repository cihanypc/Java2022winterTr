package day_06;

public class c01_concatenation {

    public static void main(String[] args) {

        String str1="java";
        String str2= "Guzel";
        int sayi1=5;
        int sayi2=3;

               //java5guzel
        System.out.println(str1+sayi1+str2);

        //2guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        //java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));


        //53Guzel
        System.out.println(sayi1+(sayi2+str2));

        //53Guzel
        System.out.println(""+sayi1+sayi2+str2);//basta bos tirnak olunca herseyi stringe cevirir.

        /*
        eger tamamen sayilardan olusan string varsa bunu int e cevirmek icin
         Integer.valueof(str)

         bir sayiyi Stringe cevirmek icin ""+sayi

         */




    }

}
