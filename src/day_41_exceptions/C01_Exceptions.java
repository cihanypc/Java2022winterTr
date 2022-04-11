package day_41_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        int c = 0;
        try {
            c = a / b;
        } catch (Exception e) {
            /*
            burda yazilan e : javanin exception i atayacagi obje
            exception ise olusan exception'nin turu
             */
           // e.printStackTrace();
            System.out.println(e.getMessage());  // \by zero
           // System.out.println(e.getCause());  // null

        }

        System.out.println(c);


    }
}
