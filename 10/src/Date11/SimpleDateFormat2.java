package Date11;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat - אובייקט המגזיר את פורמט הדפסת התאריך
//שים לב יש רגישות לאותיות גדולות וקטנות במחלקה !!!!

public class SimpleDateFormat2 {
    public static void main(String[] args) {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy");//שים לב יש רגישות לאותיות גדולות וקטנות במחלקה
        Date d=new Date();
        System.out.println(df.format(d));//מחזיר מחרוזת עם נתוני התאריך בפורמט

        df=new SimpleDateFormat("dd/mm/yy HH:mm");//במידה ונרצה שיציג את השעה רק בתור מס מ1-12 נעשה אותה h בשעות
        System.out.println(df.format(d));
    }
}
