package day_30_pes_ByWalue;

public class C01_StaticBlocks {
    static {
        System.out.println("Static blok calisti");
    }

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }
    public static void main(String[] args) {
        System.out.println("main menu calisti");

        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        /*
        ilk once static calisir
        ikinci olarak main menu calisir
        constructor obje olarak atanarak calistirilir
         */

    }
}
