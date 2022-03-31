package day_31_MutableImmutable;

public class C01_Equals {
    public static void main(String[] args) {

        String str1 = "Cihan";
        String str2 = "Cihan";/* eger yeni obje oilusturma veya bir islem yapma yoksa
        java string havuzunu kontrol eder
        */

        String str3 = new String("Cihan");

        String str4 = str1 + "";

        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true

        System.out.println(str1.equals(str4)); // true

        System.out.println(str1 == str2); //  true
        System.out.println(str1 == str3); //  false
        System.out.println(str1 == str4); //  false



    }
}
