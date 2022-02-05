package Date11;

import java.time.Month;
import java.time.MonthDay;
//שנה מעוברת שהחודש פבואר עם 29 יום
//6:59
public class leapYear6 {
    public static void main(String[] args) {
        MonthDay lastDayInFebruary =MonthDay.of(Month.FEBRUARY,29);
        for (int i=2010;i<=2017;i++){
            System.out.println("was "+i+" a leap year? "+ lastDayInFebruary.isValidYear(i));
        }
    }
}
