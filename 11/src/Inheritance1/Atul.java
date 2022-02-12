package Inheritance1;

public class Atul extends Drone{
    public Atul(String model, int batteryCapacity, int rotors, String SDK) {
        super(model, batteryCapacity, rotors, SDK);
    }

    //נוסיף לאטול שיטה שלא קיימת במחלקת דרון
    public String thermalCamera(){
        return "Kabom";
    }


    //גם פה הצטרכתי לממש את השיטה האבסטרקטית המתקבלת ממחלקת האב Drone
    @Override
    public void useSDK(String SDK) {

    }
}
