public class this7 {
    private int minutes, hours;
    //3:56
    //this נותן בתוכו את כל השיטות והמאפיינים של המחלקה

    //public int getMinutes(){...}
    public void setMinutes(int m) {
        minutes = m;
        if (minutes < 0 || minutes >= 60) {
            minutes = 0;
            System.out.println("valid value is between 0-59");
            return;
        }
        this.minutes=m;//כאשר רואים this minutes ניתן להסיק ישר כי זהו מאפיין או שיטה של המחלקה


    }
}
