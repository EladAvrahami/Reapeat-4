package Examples1;

import Interfaces2.SoundAble;

public class Car implements SoundAble {
    @Override
    public String makeSound() {
        return "Beep Beep";
    }
}
