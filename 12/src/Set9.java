import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set9 {
    /*
    * (קבוצה) הינו אוסף שמכיל כל ערך פעם אחת בלבד, כלומר לא יתכנו כפילויות של הערכים
    *ניסיון הוספה של ערך שכבר קיים לא יבוצע
      הינו ממשק לכל המחלקות הרוצות לממש מבנה נתונים זה(set)
      * ההבדל בין המחלקות השונות הממשות מבנה נתונים זה הוא הדרך בה הן מחזיקות את המידע (רשימה מקושרת, עץ וכד')
    * */

    public static void main(String[] args) {
        // ה LinkedHashSet הינה מחלקה המממשת את הממשק set והיא שומרת את האיברים לפי סדר הכנסתם
        Set<Integer> numbers1=new LinkedHashSet<Integer>();
        numbers1.add(3);
        numbers1.add(5);
        numbers1.add(2);
        System.out.println("set size is: "+numbers1.size()+"\nvalues of the set is: "+numbers1);

        //TreeSet ממיין לפי סדר כניסת ערכים
        Set<Integer> numbers2=new TreeSet<Integer>();
        numbers2.add(3);
        numbers2.add(5);
        numbers2.add(2);
        System.out.println("number2 set size is: "+numbers2.size()+"\nvalues order by values: "+numbers2);

        //********************* סט שאבריו הם אובייקטים ***********************************
        System.out.println("************ סט שאבריו הם אובייקטים ********");
        Set<Point> points=new LinkedHashSet<Point>();
        Point p1= new Point(4,4);
        points.add(p1);
        points.add(new Point(1,1));
        points.add(new Point(2,2));
        points.add(new Point(1,1));
        points.add(p1);
        System.out.println("set size" +points.size()+" the set is:");
        System.out.println(points);






    }


}
