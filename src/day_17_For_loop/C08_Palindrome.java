package day_17_For_loop;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini kontrol eden bir program yazin.
        //bir method olusturun

        String input="madam";
        palindromeKontrolEt(input);


    }

    private static void palindromeKontrolEt(String input) {

        String tersteninput="";
        for (int i = input.length()-1; i >=0 ; i--) {
            tersteninput+=input.charAt(i);

        }

        System.out.println("girilen kelimenin tersten yazilisi : "+ tersteninput);

        if (input.equalsIgnoreCase(tersteninput)){
            System.out.println("Girdiginiz kelime palindrome");
        }else {
            System.out.println("Girdiginiz kelime palindrome degil");
        }
    }
}
