package Clock4;

public class Clock4 {
    public int minutes,hours;// תכונות השעון


    public void tick(){
        minutes++;
        hours+=minutes/60;
        minutes%=60;
        hours%=24;
    }


    /*פונקציה המציגה את השעה בצורה יפה */
    public void show(){
        if (hours< 10 )
            System.out.print("0");
        System.out.print(hours+ ":");
        if (minutes<10)
            System.out.print("0");
        System.out.print(minutes);


    }

}
