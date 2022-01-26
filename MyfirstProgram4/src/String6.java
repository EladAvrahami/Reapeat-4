import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        /*string מורכב מאוסף של תווים */
        String str="hello world ";
        String name, fullName;// חייבים להצהיר על משתנה לפני השימוש בו
        int age;

        Scanner s =new Scanner(System.in);
        System.out.println("enter full  name ");
        fullName=s.nextLine();// נקסט ליין יתן לי את הערכים שהמשתמש יכניס עד שיקיש אנטר
        //עמ שגם רווחים יהיו חלק מהסטרינג
        System.out.println( "fulll name: "+fullName);
        s.nextLine();
        System.out.println("enter name ");
        name=s.next();//נקסט יקח מהיוזר את הערך עד הקשת רווח
        System.out.println(name);
        System.out.println(" enter age :");
        age =s.nextInt();
        System.out.println(age);




    }
}
