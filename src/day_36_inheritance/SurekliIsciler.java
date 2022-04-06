package day_36_inheritance;

public class SurekliIsciler extends Isci{


    public static void main(String[] args) {


        SurekliIsciler suric1 = new SurekliIsciler();
        suric1.persNo=5001;
        suric1.isim="Ali";
        suric1.soyisim="Atay";
        suric1.statu="Isci";
        suric1.saatucreti=11;
        suric1.maas=suric1.maashesapla();
        System.out.println(suric1);

    }
    @Override
    public String toString() {
        return "SurekliIsciler{" +
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
