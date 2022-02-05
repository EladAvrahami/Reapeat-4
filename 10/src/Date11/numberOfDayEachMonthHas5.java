package Date11;

import java.time.YearMonth;

public class numberOfDayEachMonthHas5 {
    public static void main(String[] args) {
        System.out.println("number Of Day Each Month Have in 2022");
        for (int i = 1; i < 12; i++) {
            YearMonth yearAndMonth=YearMonth.of(2022,i);
            System.out.println(yearAndMonth+" has "+ yearAndMonth.lengthOfMonth()+" days");
        }
    }
}
