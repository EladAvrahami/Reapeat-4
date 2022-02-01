import Clock4.Clock4;
import GettersAndSetters6.getAndSet;

//לסיכום
/*כדי לאפשר השמת ערך בתכונה שהיא פריווט נכתוב שיטת set
שהיא public המבצעת את פעולות ההשמה :
השיטה תקבל כנתון את הערך המבוקש תבצע בדיקות תקינות על הערך שהתקבל ותעדכן את הערך בתכונה במידה ועמד בתנאים
גדי לאפשר קבלת ערך תכונה שהיא פריווט נכתוה שיטת get שהיא public

* */
import java.util.Scanner;

public class SetInMainClass8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        getAndSet c1 = new getAndSet();//clock class i just pick another name .
        boolean res;

        do {
            System.out.println("enter hours:");
            res = c1.setHours(s.nextInt());
        } while (res != true);

        do {
            System.out.println("enter minutes:");
            res = c1.setMinutes(s.nextInt());
        } while (res != true);

        c1.show();
        System.out.println();


    }
}
