package day_07;

public class c02_if_statement {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        if (a < b && b < 100) {
            System.out.println("isteginiz gerceklesecek");
            System.out.println("body icindeki tum kodlar calisti");
        }

        if (a > 0) System.out.println("suslu parantez olmazsa sadece bir satir calisir");

        System.out.println("2.satir da calisti");

        //bir if cumlesinin daha anlasilabilir olmasi icin
        // if body si {} icine yazilmalidir.
        // body i {} icine yazmazsak da if cumlesi calisir
        // ancak ilk if ; gordugunde if cumlesi bitmis olur



    }
}
