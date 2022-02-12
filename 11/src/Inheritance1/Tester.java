package Inheritance1;

public class Tester {
    public static void main(String[] args) {
        DJI dji =new DJI("AIR 2S",2200,4,"some SDK");
        //dji.   //בצורה כזאת ניתן לראות את כל השיטות שמופיעות בדרון

        Atul atul=new Atul("EVO2 ",6000,8,"Aut3");
        atul.thermalCamera();//כעת ניתן לראות שהשיטה שייחודית למחלקת אטול כן תופיע שנצהיר על אובייקט חדש מסוג אטול

        //כעת שנדפיס מכיוון שמימשתי טו סטרינג במחלקת Drone ההדפסה כבר לא תפנה אותי לכתובת בזיכרון
        //אלא תממש את הטוסטרינג בהדפסה
        System.out.println(dji);//memory address
        System.out.println(dji.show());

        /*השורה מטה תציג שגיאה מכיוון שדרון היא מחלקה אבסטרקטית
        * כלומר אין פה רעיון ליצור מחלקה שאין לה קשר לתוכנה אלה היא רק פה על מנת לספק שלד
        * לא ניתן ליצור ממחלקה אבסטרקטית מופעים */
        //Drone drone=new Drone("BLA BLA",4550,4,"GENERAL"); {
       // }
    }

}
