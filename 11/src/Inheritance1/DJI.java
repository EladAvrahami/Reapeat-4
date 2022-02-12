package Inheritance1;

public class DJI extends Drone{
    public DJI(String model, int batteryCapacity, int rotors, String SDK) {
        super(model, batteryCapacity, rotors, SDK);
    }

    public String show(){
        //שימוש בטוסטרינג וסטרינג באפפר עמ להחזיר ולהדפיס את הערך
        StringBuffer builder=new StringBuffer();
        builder.append("DJI - ");
        builder.append(getModel());
        return builder.toString();
    }

    /*שימוש בסופר שעוזר לרשת את ההדפסה של מחלקת האב רחפן בנוסף להדפסה הייחודית שמודפסת
    * במתודה טוסטרינג למטה בעלת הערך הנוסף של הסטרינג " DJI-" */
    @Override
    public String toString() {
        return "DJI-  "+super.toString();
    }


    //ניתן לראות שבגלל ששיטה זו במחלקת דרון אבסטרקטית יש לממש אותה שוב באופן ייחודי במחלקה(היורשת) כאן
    //כלומר ברגע שהפכתי שיטה לאבסורקטית יש לי חיוב לממש אותה במחלקה היורשת
    @Override
    public void useSDK(String SDK) {
        System.out.println("דוגמא לאוברייד שנובע משימוש בשיטה אבסטרקטית במחלקת האב במחלקת DJI");

    }
}
