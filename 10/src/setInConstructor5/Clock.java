package setInConstructor5;

//בנאי מופעל רק בהפעלה
//set מופעל על מנת לשנות ערכים של אובייקט שכבר קיים
public class Clock {
    int hours,minutes;

    public Clock(){}

    public Clock(int h,int m){
       setHours(h);//כל פעם שאני יוצר מופע חדש כבר תהיה בדיקת תקינות לפרמטרים שלו
        minutes=m;
    }

    public void setHours(int h) {
        if (h>23){
            h=0;
            System.out.println("error");
        }
        hours=h;
    }
}
