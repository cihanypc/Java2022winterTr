package day_33_varargs_StringBuilder;

public class C03_stringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java cok guzel");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println("sb1 length" + sb1.length());  // 0
        System.out.println("sb1 capacity" + sb1.capacity()); // 16

        System.out.println("sb2 capacity" + sb2.length()); // 14
        System.out.println("sb2 capacity" + sb2.capacity()); // 30

        System.out.println("sb2 capacity" + sb3.length()); //  0
        System.out.println("sb2 capacity" + sb3.capacity()); // 10

        // apped methodu ile sb a ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel.");
        System.out.println("sb1 length" + sb1.length());  // 14
        System.out.println("sb1 capacity" + sb1.capacity()); // 16

        sb1.append(3);
        System.out.println(sb1); // java cok guzel3

        sb1.append(true);
        System.out.println(sb1); // java cok guzel3true

        System.out.println("sb1 length" + sb1.length());  // 20
        System.out.println("sb1 capacity" + sb1.capacity()); // 34


        sb1.trimToSize(); //  length ile capasite arasnda ki fazlaligi atar
        System.out.println("sb1 length" + sb1.length());   // 20
        System.out.println("sb1 capacity" + sb1.capacity());  // 20


    }
}
