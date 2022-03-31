package day_23_multidimensional_arrays;

public class C02_MDarrays {
    public static void main(String[] args) {
        //  verilen MD arrayin tum elemenlerinin toplamini bulunuz

        int arr[][] = {{3, 1, 7,5}, {6, 10}};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
        }
        System.out.println("array deki elementlerin toplami : " + toplam); // 32 inner larin uzunluklari esit olmak zorunda degil


    }
}
