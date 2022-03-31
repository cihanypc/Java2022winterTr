package day_30_pes_ByWalue;

public class C02_StaticBlocks {
    {
        System.out.println("Static olmayan block calisti");
    }

    static {
        System.out.println("Static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main menu basi");

        C02_StaticBlocks obj1 = new C02_StaticBlocks();
        C02_StaticBlocks obj2 = new C02_StaticBlocks();


    }
    /*
    static olmayan bloklar ise obje olusturulurken calisir
    static blocklar sadece bir kere en basta calisir ama
    static olmayan bloklar her obje olusturulurken yeniden calisir
     */


}
