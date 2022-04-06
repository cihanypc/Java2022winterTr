package day_36_inheritance;

public class Memur extends Muhasebe{

    @Override
    public String toString() {
        return "Memur{" +
                "saatucreti=" + saatucreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Memur memur1=new Memur();
        // memur1 objesi memur classinin objesi olmasina ragmen inherited ettigi muhasebe ve
        // onunda parent i olan personel classlarinda ki tum datalari alabilir

        // personel classindan
        memur1.persNo=1001;
        memur1.isim="Cihan";
        memur1.soyisim="Yapici";
        memur1.adres="Groningen";
        memur1.tel="564654646";


        memur1.saatucreti=10;
        memur1.statu="memur";
        memur1.maas= memur1.maashesapla();
        System.out.println(memur1);


        Memur memur2 = new Memur();
        memur2.persNo=1002;
        memur2.saatucreti=10;
        memur2.maas= memur2.maashesapla();

    }
}
