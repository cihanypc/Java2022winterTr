package day_39_overriding;

public class OverridingChild extends OverridingParents {
    public void method1() {
        System.out.println("Child class method1");
    }

    public static void main(String[] args) {

        /*
        bir obje olusturulurken data turu ve cons. ayni clastan secilmisse java direk o class a gider
        hem veriable hemde method icin o class da kullanir yoksa o classin parentlarina bakar
         */

        OverridingChild obj1 = new OverridingChild();

        obj1.method1();  // Child class method1
        obj1.method2();  // Parent class method2

        OverridingParents obj2 = new OverridingChild();
        obj2.method2();  // Parent class method2
        obj2.method1();  // Child class method1

        OverridingParents obj3 = new OverridingParents();
        obj3.method2();  // Parent class method2
        obj3.method1();  // Parent class method1
        /*
        eger data turu parent , cons. child classdan secildiyse veriablelar da yukaridaki sekilde calisma devam eder
        ancak methodlar icin data turunun oldugu clasdaki method child class tarafindan override edilmis mi
         diye kontrol etmemiz gerekir eger  childclasslarda bu method override edilmisse override eden method calisir
         */


    }

}
