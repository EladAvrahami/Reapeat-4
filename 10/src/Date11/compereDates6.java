package Date11;

import java.time.LocalDate;
import java.time.Month;

public class compereDates6 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.of(2014, Month.MAY,20);
        LocalDate d2=LocalDate.of(2015,Month.MAY,20);
        System.out.println("d1 before d2? : "+d1.isBefore(d2) );
        System.out.println("d1 after d2? : " +d1.isAfter(d2));
        System.out.println("d1 compare to d2? : " + d1.compareTo(d2));//קומפרטוק יציג לי
        //-1 0 או 1 משמש למיון
    }
}
