package day_33_varargs_StringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {
        // kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun

        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";

        carpim(sayi, str1, str2);
        /*
        bir method da varargs disinda parametre kullanacaksak once diger parametreleri yazip
        varargs i en sona yazmaliyiz
        bu sebeple bir method da birden fazla varargs olamaz
         */


    }

    private static void carpim(int sayi, String... str) {

        String enuzunstr = "";

        for (String each : str
        ) {
            if (each.length() > enuzunstr.length()) {
                enuzunstr = each;
            }
        }
        System.out.println("istenen deger : " + sayi * enuzunstr.length()); // 30
    }
}
