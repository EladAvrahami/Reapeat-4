package Animal8;

/*מכיוון שאין משמעות לחיה אצלי בתוכנית משום שמחלקה זו לא אמורה להיות אובייקט מוחשי היא אבסטרקטית*/
public abstract class Animal {
    private int numOfLegs;
    private boolean hasTails;
    private String color;

    public Animal(int numOfLegs, boolean hasTails, String color) {
        this.numOfLegs = numOfLegs;
        this.hasTails = hasTails;
        this.color = color;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public boolean isHasTails() {
        return hasTails;
    }

    public void setHasTails(boolean hasTails) {
        this.hasTails = hasTails;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //שוב יצירת שיטה אבסטרקטית שאומרת שעליי לממש בצורה ייחודית בכל מחלקה
    //למשל קול של חתול לעומת כל של כלב במקרה זה
    //הכלל אומר שבמידה ולא מימשתי במחלקת הבסיס את השיטה מחלקת הבן תהיה חייבת לממש
    public abstract String makeSound();
}
