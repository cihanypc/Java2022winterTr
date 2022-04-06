package day_36_inheritance;

public class Ustabasi extends Isci{
    public static void main(String[] args) {
        Ustabasi ustabasi1=new Ustabasi();

        ustabasi1.saatucreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Yilmaz";
        ustabasi1.maas= ustabasi1.maashesapla();
        ustabasi1.statu="Isci";
        ustabasi1.iscistatu="ustabasi";
        System.out.println(ustabasi1);
    }

    @Override
    public String toString() {
        return "Ustabasi{" +
                "iscistatu='" + iscistatu + '\'' +
                ", saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
