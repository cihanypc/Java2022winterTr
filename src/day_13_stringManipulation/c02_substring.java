package day_13_stringManipulation;

public class c02_substring {
    public static void main(String[] args) {

        /* 1-48 of 104 results for "nutella"
        bu arama sonucunda ki bulunan sonuc sayisi 100 den cok ise super
        az ise az sonuc bulundu yazdirin
         */
        String str = "1-48 of 104 results for \"nutella\"";
        int ilkSpace = str.indexOf(" ");//4
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);
        int ucuncuspace = str.indexOf(" ", ikinciSpace + 1);

        String aramasonucSayisiStr = str.substring(ikinciSpace + 1, ucuncuspace);
       // System.out.println(aramasonucSayisiStr); // 104
        int aramasonucSayisiInt = Integer.valueOf(aramasonucSayisiStr);

        if (aramasonucSayisiInt > 100) {
            System.out.println("super");
        } else {
            System.out.println("az sonuc bulundu ");

        }

    }
}
