package day_21_arrays;

public class C01_arrays {
    public static void main(String[] args) {
        // data turu, arrayin ismi ve koseli parantez yazarak array deklare edilir


        int arr1[]= {1,3,5};  // eger array olusturuluyorsa mutlaka koseli parantez olmak zorunda
        int[] arr2={1,3,5};
        int [] arr3={1,4,5};

        double arr4 []= {10.2,20.5,3.5};
        String arr5[]={"ali","veli","cihan"};

        int arr6[];  // itiraz etmez ama kullanmadan once mutlaka deger atamasi yapmak gerekir.
                    // hem deklare edip hem atama yapacaksak nasil yapilir?
                    // 1- deklare edip esitligin sagina suslu parantez icerisine degerler yazilabilir
                    // 2- icine deger atamadan olusturmak icin , boyutunu belirlemek gerekir.

        int arr7[]=new int[5];  // burda java dan yeni array uretmesi istenir ve yeni arraye deger girilmesi gerekir
        // java icinde 5 tane default deger olan bir array olusturur.
        // int default degeri 0 oldugu icin [0,0,0,0,0] sonucunu verir


    }
}
