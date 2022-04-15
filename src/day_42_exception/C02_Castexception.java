package day_42_exception;

public class C02_Castexception {
    public static void main(String[] args) {

        int sayi = 10;
        //  String str = sayi;   CTE

        Object sayi2 = 20;
        String str2= (String) sayi2;  // explicit Norowing   // calistigi zaman  .ClassCastException veiri

        Object str3= "java cok guzel ";
        String str4=(String) str3;
        System.out.println(str4);

    }
}
