package day_32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_ikitariharasinibulma {
    public static void main(String[] args) {

        LocalDate bugun =LocalDate.now();
        LocalDate dogumgunu =LocalDate.of(1992,02,13);

        System.out.println(Period.between(dogumgunu,bugun));  // P30Y1M18D

        System.out.println(Period.between(dogumgunu,bugun).getDays()); // 13
        System.out.println(Period.between(dogumgunu,bugun).getYears()); // 30



    }
}
