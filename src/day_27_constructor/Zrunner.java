package day_27_constructor;

public class Zrunner {
    public static void main(String[] args) {
        Z obj1=new Z("Cihan","Yapici",10,true);
        System.out.println(obj1);


        Z obj2 = new Z("Ali","Kaya",60); // degerler onceki classdaki siralamaya gore girilmelidir
        System.out.println(obj2);

    }
}
