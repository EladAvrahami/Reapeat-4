public class Contsructor1 {

    /* במיין נוכל ליצור אובייקט עי שימוש במילה NEW
    * לדוגמא Clock c1=new Clock
    * באופן זה ערכי האובייקט שנוצר הם 0
    * כל יצירת אובייקט עוברת בשיטה הניתנת במתנה עי הקומפיילר ונקראת בנאי
    *
    * מטרתו העיקרית של הבנאי הוא ליצור מופע עם ערכים שאני בוחר מראש
    * כלמחלקה יש בנאי ברירת מחדל ששם 0 בכל ערכי השדות
    * ניתן לדרוס בנאי זה
    *
    * שם הבנאי תמיד יהיה כשם המחלקה ולא יהיה לו ערך החזרה
    * */

    //דוגמא לדריסת בנאי ברירת מחדל במחלקה Contsructor1
    //שים לב בקונסטרקטור למרות שלא מציינים ערך החזרה לא רושים viod

    private int minutes,hours;
    public Contsructor1(){
        System.out.println();
    }

}
