package day_32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println(tarihsaat); // 2022-03-31T21:35:25:454963

        System.out.println(tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(6).plusMinutes(45));
        // 2025-06-11T04:23:13.133822200


    }
}
