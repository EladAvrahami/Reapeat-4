package EladPhoneExLossCo3;

public class Android implements MobileAble {
    String model;

    public Android(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Android{" +
                "model='" + model + '\'' +
                '}';
    }
}
