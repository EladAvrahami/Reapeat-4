package EladPhoneExLossCo3;

public class Iphone implements MobileAble {
    String model;

    public Iphone(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                '}';
    }
}
