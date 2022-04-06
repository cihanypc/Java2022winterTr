package day_33_varargs_StringBuilder;

public class C01_Varargs {
    public static void main(String[] args) {
        // kac tane string verilirse verilsin iclerinden en uzun olani yazdiran bir method olusturun

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Cihan";
        String str4 = "Yunuscan";

        /*  yazilan argument sayisi sabitse herzaman ki gibi bir method olusturabiliriz
        ancak argument sayisinin degisme ihtimali varsa varargs tercih edilir

         */
        enuzunKelime(str1, str2, str3,str4); // buraya eklendikce en uzun kelimeyi bulur
        // burdan cikartilanlari dikkate almaz
        // esit olan uzunluklarda hangisi once yazilirsa onu dikkate alir


    }

    private static void enuzunKelime(String... str) {

        String enuzunstr = "";

        for (String each : str
        ) {
            if (each.length() > enuzunstr.length()) {
                enuzunstr = each;
            }
        }
        System.out.println("En uzun kelime : " + enuzunstr);  // Cihan

    }
}
