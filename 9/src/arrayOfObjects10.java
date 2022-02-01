import Clock4.Clock4;

public class arrayOfObjects10 {
    public static void main(String[] args) {
        Clock4[] clock4s=new Clock4[3];//יצירת מערך בשם שעונים בגודל 3
        //דוגמא לאיך להקצות מקןם חדש בזיכרון
        for (int i =0; i<clock4s.length;i++){//שימוש בללואה
           clock4s[i]=new Clock4();//יציאת מופע חדש של אובייקט בכל אחד מהתאים i

        }

        //דוגמא 2 שינוי ערך השעות יהיה אפשרי משום שיצירת מקום בזיכרון תא 0
        //תא 1 לא קיבל הפנייה לזיכרון באמצעות =new Clock4() ןלכן יציג שגיאה
       /*clock4s[0]=new Clock4();
        clock4s[0].setHours(20);
        clock4s[1].setMinutes(40);// שורה זו תיצור שגיאה של null pointer exeption
        */




    }
}
