package mentor;

public class alıstırma1 {
    public static void main(String[] args) {

        // string seklinde girilen asagidaki fiyatlarin toplamini bulunuz
        // string str1= "$13.99"
        // String str2 = "$10.55"


        String str1="$13.99";
        String str2 = "$10.55";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");

        System.out.println("$"+str1);  // yarim kaldi






    }
}
