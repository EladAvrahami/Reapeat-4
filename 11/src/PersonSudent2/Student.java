package PersonSudent2;

//תלמיד ירש ממחלקת בן אנוש
public class Student extends Person {
    public float average;

    /*בנאי שמגיע ממחלקת הבסיס */
   /* public Student(int id, String name) {
        super(id, name);
    }*/


    /* *******************Super***************דוגמא   */
    /*על מנת לחסוך כתיבה זו ניתן להשתמש בסופר כפי שמופיע למעלה ולהוסיף ברשימת הערכים שמקבל גם את הערך ממוצע שהגדרנו */
    public Student(int id, String name, float average) {
        super(id, name);//קודם קריאה לבנאי של מחלקת הבסיס
        this.average = average;//פניה לשאר האובייקטים במחלקה

        //דוגמא נוספת ב1:38 מאוד חשוב להבנה שקודם כל הולך לבנאי מחלקת הבסיס ורק לאחר מכן ממשיך
    }
}
