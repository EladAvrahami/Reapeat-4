package Date11;

import java.util.Date;

public class DateClass1 {
    //6:23
    public static void main(String[] args) {
        //כאשר כי יש לי דיפריקיישן -משהו שלא משתמשים בו יופיע קו עליו
        Date d1=new Date();
        System.out.println(d1.toGMTString());
        System.out.println(d1.toLocaleString());
        System.out.println(d1.toString());

        /* System.out.println(d1.toGMTString());
        System.out.println(d1.toLocaleString());
        System.out.println(d1.toString());*/
    }
}
