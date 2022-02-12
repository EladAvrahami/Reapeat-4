package Animal8;

public class Dog extends Animal{
    private String chipNum;

    public Dog(int numOfLegs, boolean hasTails, String color, String chipNum) {
        super(numOfLegs, hasTails, color);
        this.chipNum = chipNum;
    }

    @Override
    public String makeSound() {
        return "Haoooo Haooooo";
    }
}
