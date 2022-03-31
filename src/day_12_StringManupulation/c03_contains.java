package day_12_StringManupulation;

public class c03_contains {
    public static void main(String[] args) {
        // kullanicidan mail adresini isteyin
        // mail @gmail.com icermiyorsa lutfen gmail adresi giriniz
        // @gmail.com ile bitiyorsa email adresiniz kaydedildi
        //@gmail.com ile bitmiyorsa lutfen yazimi kontrol edin

        String email = "ypcihan@gmail.com";
        String aranankelime = "@gmail.com";

        if (!email.contains(aranankelime)) { // basina unlem konuldugu icin istenilenin tersi alir
            System.out.println("lutfen gmail adresi giriniz ");

        } else if (email.lastIndexOf(aranankelime) == (email.length() - 10)) {
            System.out.println("email adresiniz kaydedildi");

        } else {
            System.out.println("lutfen yazimi kontrol edin");
        }

    }
}
