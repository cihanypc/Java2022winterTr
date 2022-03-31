package day_32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm);// 21.10.01.017511


        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi += i;
        }
        LocalTime tmyeni = LocalTime.now();
        System.out.println(tmyeni); // 21.10.01.217511

        double nano1 = tm.getNano();
        double nano2 = tmyeni.getNano();

        System.out.println("islem " + (nano2 - nano1) + " nano saniyede bitti"); //  1.56277E7

        // ileri veya geriye gideriz
        System.out.println(tm.plusMinutes(1000));  // 13.59.228851

        // istersek zone id kullanarak istedigimniz bolgenin saati icinde obje olusturabiliriz

    }
}
