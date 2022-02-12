package Animal8;

public class Cat extends Animal{
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
