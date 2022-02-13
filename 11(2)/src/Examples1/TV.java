package Examples1;

import Interfaces2.SoundAble;

public class TV implements SoundAble {
    @Override
    public String makeSound() {
        return "action movie ";
    }
}
