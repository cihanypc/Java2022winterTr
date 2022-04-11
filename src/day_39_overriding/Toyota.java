package day_39_overriding;

public class Toyota extends Araba{

    String hiz= "Toyota araclar max 220 km hiz yapar";
    String marka = "Toyota";
    String sirketMerkezi = "Japonya";


    public void motor(){
        System.out.println("Toyota arabalar Toyota marka motor kullanirlar");
    }

    public void garanti (){
        System.out.println("Toyota araclar 10 yil garantilidir");
    }
}
