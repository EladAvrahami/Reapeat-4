import java.util.Scanner;



public class DoWhile5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        //לולאת נעשה ונשמע
        // קודם תעשה מה שבדו ןאחכ תתנה על מנת שתנאי יתבצע לפחות פעם אחת
        do {
            System.out.println(" enter positive num ,negative to exit: ");
            num=s.nextInt();
        }while (num>=0);
        System.out.println(" thank U !");
    }
}
