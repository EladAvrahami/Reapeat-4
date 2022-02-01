package Clock4;

public class mainClock4 {
    public static void main(String[] args) {

        //שם משתנה  שם הטיפוס
        Clock4 c1       =new Clock4();// יצירת אובייקט

        //DI- dependency injection
        c1.hours=10;
        c1.minutes=8;
        System.out.println("the time is : ");
        c1.show();
        System.out.println();

    }
}
