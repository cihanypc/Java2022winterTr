package day_11_StringManipulation;

import java.util.Locale;

public class c02_equals {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali" + " Can";
        System.out.println("str1 :" + str1);
        System.out.println("str2 :" + str2);

        System.out.println();
        System.out.println("== ile karsilastir :" + (str1 == str2));
        System.out.println("eguals ile karsilastir :" + (str1.equals(str2)));

        String str3 = str1+"";
        System.out.println("str3 :"+str3);
        System.out.println("== ile karsilastir :"+(str3==str2));
        System.out.println("equals ile karsilastir :"+ str3.equals(str2));


        // String te == her zaman dogru sonuc vermez
        // bunun icin emin oldugunuz equals methodunu kullaniniz


        String str5= "hasan";
        String str6="HASAN";
        System.out.println(str5.equals(str6)); // false
        System.out.println(str5.toUpperCase(Locale.ROOT).equals(str6));
        // True



    }
}
