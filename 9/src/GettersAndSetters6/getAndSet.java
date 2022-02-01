package GettersAndSetters6;

//getter -מחזיר
//setter - מעדכן
//נשתשמש בגטטר סטטר על מנת לבצע ולידציה
public class getAndSet {
    //דוגמא שעון
    //ניתן לבצי ולידציה בהגדרה של הסטטר שמוכזר עי המשתש עמ לבדוק אם ערך
    //הזמן שהכניס אפשרי כמו בשיטה setMinutes

    private int minutes, hours;

    //public int getMinutes(){...}

    //ולידציה על הדקות
    public boolean setMinutes(int m) {
        minutes = m;
        if (minutes < 0 || minutes >= 60) {
            minutes = 0;
            System.out.println("valid value is between 0-59");
            return false;
        }
        return true;
    }

    //public int getHours(...){}
    //ולידציה על השעות
    public boolean setHours(int h) {
        hours = h;
        if (hours < 0 || hours >= 24) {
            hours = 0;
            System.out.println("valid hour is between 0-23");
            return false;
        }

        return true;
    }









    public void show(){
        if (hours< 10 )
            System.out.print("0");
        System.out.print(hours+ ":");
        if (minutes<10)
            System.out.print("0");
        System.out.print(minutes);


    }

}
