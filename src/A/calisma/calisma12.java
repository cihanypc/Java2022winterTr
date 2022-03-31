package A.calisma;

import java.util.Scanner;

public class calisma12 {
    		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen is unvanizi giriniz : pm");
        String jobtitle = scan.nextLine().toLowerCase();

        if (jobtitle.equals("qa")) {
            System.out.println("Unvaniniz : Quality analyst");
        } else if (jobtitle.equals("dev")) {
            System.out.println("Unvaniniz : Developer");
        } else if (jobtitle.equals("ba")) {
            System.out.println("Unvaniniz : Business analyst");
        } else if (jobtitle.equals("pm")) {
            System.out.println("Unvaniniz : Project Manager");
        } else {
            System.out.println("Lutfen gecerli bir unvan giriniz");
        }
        //2. yol switch

        switch (jobtitle) {
            case "qa":
                System.out.println("Unvaniniz : Quality analyst");
                break;
            case "dev":
                System.out.println("Unvaniniz : Developer");
                break;
            case "ba":
                System.out.println("Unvaniniz : Business analyst");
                break;
            case "pm":
                System.out.println("Unvaniniz : Project Manager");
                break;
            default:
                System.out.println("Lutfen gecerli bir unvan giriniz");
                break;
        }
    }
}
