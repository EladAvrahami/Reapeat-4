package Clock4;

public class Clock {
    int hours,minutes;


    //תפקידו של הבנאי הוא לבנות את המופע -ססניית המופע עצמו כבר תכניס לי את הנתונים פנימה
    public Clock(int h,int m){
        hours=h;
        minutes=m;
    }

    //שים לב ! תמיד לאחר הגדרת בנאי נוסף הבנאי הדיפולטיבי ייעלם לכן על מנת שתהיה האפשרות
    //לקבל לבנות אובייקט שלא מקבל פרמטרים עלינו לכתוב אותו שוב
    public Clock(){} //הוספתי בנאי דיפולטיבי עמ שלא כל שעון שניצור יהיה חייב להיות בעל ערכים דיפולטיביים
}
