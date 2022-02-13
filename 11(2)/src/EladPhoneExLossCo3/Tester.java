package EladPhoneExLossCo3;

public class Tester {
    public static void main(String[] args) {

        /*Android phone=new Android("galaxy s21");
        Iphone myPhone=new Iphone("Iphone 12 max pro");
        myPhone=new Iphone("Iphone 13 max pro");
        System.out.println(phone);
        System.out.println(myPhone);*/



        //לאחר שיישמתי את הממשק מובייל למחלקת אייפון ואנדרואיד:
        //משחרר צימוד
        // לא חייב להיות כל פעם או אייפון או אנדרואיד אלה מכיוון שעופר הוא מסוג מוביילבול
        // ניתן לשנות בין מכישרים
        MobileAble ofer=new Iphone("iphon 13 ");
        //System.out.println(ofer);
        //לך תחליף פלאפון עופר
        ofer=new Android("sumsung galexi 21");
        //יקר לי תביא מכשיר אנדרואיד אחר
        ofer=new Android("Xiaomi pro");
        //שוב מחליף
        ofer=new Iphone("13 max 256GB");
        System.out.println(ofer);
        System.out.println(ofer instanceof Android?"Android":"Iphone" );


        //יצירת אובייקט בתוך מערך
        MobileAble[] stam={new Android("s21"),new Iphone("iphone 12")};


    }
}
