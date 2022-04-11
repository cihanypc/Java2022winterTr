package day_40_overriding_Pollymorphism;

public class C02 extends C01 {
    @Override
    public void method2() {
        System.out.println("Child method2");

        /*
        override notasyonu overriden methodu ile overriding methodu birbirine baglar
        farkinda olunmadan overriden method silinirse veya signature degistirilirse
        bu iliski bozulacagi icin java cte verir

        notasyon kullanilmazsa java bunlarin iliskisini bilir ama overriden method silinirse sesini cikarmaz.
         */
    }

    public static void main(String[] args) {
        C02 obj = new C02();

        obj.method1();  // parent method1
        obj.method2(); // Child method2

        C01 obj2 = new C02();
        obj2.method1(); // parent method1
        obj2.method2(); // Child method2

        C01 obj3 = new C01();
        obj3.method1(); // Parent method1
        obj3.method2(); // Parent method2


    }
}
