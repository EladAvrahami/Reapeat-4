package Clock4;

public class Tester {
    public static void main(String[] args) {
        //משום ששיניצי את הבנאי במחלקת שעון הבנאי הדיפולטיבי נמחק ולכן הבנאי הריק כרגע מצביע על תקלה
        // Clock c1= new Clock(){}
        //לכן נהיה מוכרחים לתת ערכים היצירת הבנאי
        Clock c2 = new Clock(10, 30);
        Clock c3 = new Clock(16, 5);
        Clock c4 = new Clock();//יצירת שעון עי שימוש בבנאי הדיפולטיבי


    }
}
