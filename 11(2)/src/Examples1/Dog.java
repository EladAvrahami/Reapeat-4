package Examples1;

import Interfaces2.SoundAble;

public class Dog extends Animal implements SoundAble {
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
