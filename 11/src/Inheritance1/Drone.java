package Inheritance1;

//הייתרון הגדול בהורשה הוא שכאשר נוסיף שיטה נוספת למחלקת בסיס זו כל המחלקות שיורשות ממנה גם יקבלו את השיטה
//מעיין פונקציה מודולרית כמו JS
public abstract class Drone {
    private String model;
    private int batteryCapacity;
    private int rotors;//מס להבים
    private String SDK;

    public Drone(String model, int batteryCapacity, int rotors, String SDK) {
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.rotors = rotors;
        this.SDK = SDK;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRotors() {
        return rotors;
    }

    public String getSDK(){
        return SDK;
    }

    public boolean fly() {
        return true;
    }

    public boolean tackOff() {
        return true;
    }
    public boolean land(){
        return true;
    }
    public void trackMe(){}


    //ברגע שאני ממש טוסטרינג כאשר אדפיס אובייקט הוא כבר לא יציג לי את המקום בזיכרון של האובייקט
    //אלא הוא יתחיל לכתוב את מה שבטוסטרינג
    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", rotors=" + rotors +
                ", SDK='" + SDK + '\'' +
                '}';
    }

   /* public void useSdk(String SDK){
    }*/
    //ניתן לרשום שיטה במחלקה אבסטרקטית כך :
    //ברגע שהשיטה היא אבסטרקטית כל המחלקות היורשות חייבות לממש את השיטה
    //עשיתי implement method במחלקות DJI ו ATUL כדי לעשות אוברייד ולממש שם מחדש את השיטה
    public abstract void useSDK(String SDK);//הצהרה על החתימה של הפונקציה
}
