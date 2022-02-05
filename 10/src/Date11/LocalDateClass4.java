package Date11;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateClass4 {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();//מכיוון שלוקלדייט הוא סטטיק אין צורך להשתמש בnew
        System.out.println("i made this example on the : "+today.toString());
        System.out.println("the day of the week:"+today.getDayOfWeek());
        System.out.println("yesterday was "+today.minusDays(1).getDayOfWeek());
        System.out.println("tomorrow is : "+ today.plusDays(1).getDayOfWeek()+" the "+today.plusDays(1));

        LocalDate comingSaturday=today.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));//תי יום שישי הבא עלינו לטובה
        System.out.println("coming saturday is: "+comingSaturday.toString());

        System.out.println("==================================");
        LocalDate someDate=LocalDate.of(2014, Month.FEBRUARY,20);
        System.out.println("some date is : "+someDate.toString());
        System.out.println("==================================");
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("better print for israel : "+ someDate.format(dtf));
        System.out.println("==================================");
        LocalDate nextSalaryDate=someDate.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("next salary enter at : "+nextSalaryDate.toString());





    }
}
