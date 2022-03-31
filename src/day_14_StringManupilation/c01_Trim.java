package day_14_StringManupilation;

public class c01_Trim { // basta ki ve sonda ki bosluklari siler

    public static void main(String[] args) {

        String str = "   siz ne derseniz deyin, java bildigini okur   ";

        str.trim();
        System.out.println(str);// atama yapilmadigi icin burda // basta ki ve sonda ki bosluklari  kesmez
        System.out.println(str.length());  // 49

        str = str.trim();
        System.out.println(str);
        System.out.println(str.length()); //  43

    }
}
