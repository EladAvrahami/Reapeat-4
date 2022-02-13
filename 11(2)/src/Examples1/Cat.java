package Examples1;

import Interfaces2.SoundAble;

public class Cat extends Animal implements SoundAble {
    private int tailLength;

    public Cat(int numOfLegs, boolean hasTails, String color,int tailLength) {
        super(numOfLegs, hasTails, color);//יהיה שווה לערך בנאי במחלקת אנימל ולכן שימוש במילה super
        this.tailLength=tailLength;//יהיה שווה לערך הבנאי כאן ולכן שימוש במילה this
    }


    @Override
    public String makeSound() {
        return "Miooooo Cat";
    }
}
