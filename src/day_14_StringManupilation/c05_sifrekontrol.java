package day_14_StringManupilation;

public class c05_sifrekontrol {
    public static void main(String[] args) {

        /*Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        "Sifre basari ile tanimlandi", sartlari saglamazsa
        "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
    - Ilk harf buyuk harf olmali
    - Son harf kucuk harf olmali
    - Sifre bosluk icermemeli
    - Sifre uzunlugu en az 8 karakter olmali
  */
        String sifre = "Asdf12345c";

        boolean ilkharf = false;
        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            ilkharf = true;
        } else {
            System.out.println("sifrenizin ilk harfi buyuk harf olmali");
        }

        boolean sonharf = false;
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(0) <= 'z') {
            sonharf = true;
        } else {
            System.out.println("sifrenizin sonharfi kucuk olmali");
        }

        boolean bosluk = false;
        if (!sifre.contains(" ")) {
            bosluk = true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk = false;
        if (sifre.length() >= 8) {
            uzunluk = true;
        } else {
            System.out.println("sifre en az 8 karakter olmali");
        }

        if (ilkharf && sonharf && bosluk && uzunluk) {
            System.out.println("sifreniz basariyla olusturuldu");
        }

    }
}
