package day_32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate trh = LocalDate.now(); // objenin olusturuludugu tarihi trh ye (veriable a) atar
        LocalDate trh2 = LocalDate.of(1992, 3, 12);
        // istedigimiz yil ay gune degerlerine gore bize obje olusturur.

        System.out.println(trh); //  2022-03-31
      // get li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); //  31
        System.out.println(trh.getDayOfWeek()); //  THURSDAY
        System.out.println(trh.getMonthValue()); // 3
        System.out.println(trh.getYear());  // 2022

        // bir tarihten istedigimiz kadar ileri veya geri gidebiliriz

        System.out.println(trh.minusWeeks(20)); // 2011 11  11   minus geri tarihe gider
        System.out.println(trh.minusWeeks(5).minusDays(3)); // 2022 02 21

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023 01 10   plus ileri tarihe gider


        // is ile baslayan methodlar boolean sonuclar doner
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(trh2)); // true

        //istedigimiz ulkenin o andaki tarihini elde etmek istersek

        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022 04 01 japonya da gun bir gun ilerde tarih atlamis



    }
}
