package Date11;

import java.util.Calendar;
import java.util.Date;

//המחלקה date  היאה מחלקה ישנה שזמנה קרוב -דיפריקייטד
public class InitDateObject3 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2022,02,05,19,17,30);
        Date d1=c.getTime();
        System.out.println(d1.toLocaleString());
    }
}
