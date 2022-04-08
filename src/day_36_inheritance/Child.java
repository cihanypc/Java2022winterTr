package day_36_inheritance;

public class Child extends Parent{

    Child (){
        super();

        System.out.println("Child cons. calisti");
    }

    public static void main(String[] args) {

        Child child = new Child();

        /*
        tum class larda biz gormesek bile javanin olusturdugu default cons. vardir

        tum cons. larin ilk satirinda biz gormesekte super cons. call vardir
        super class= parent class
        yani parent classin parametresiz cons.call
         */
    }
}
