import java.util.Scanner;

//דוגמא זו באה להדגים שימוש בפונקציה חיצונית
public class Void11 {
    // במידה והפונקציה אינה מחזירה ערך נרשום כערך המחוזר void
    // החזרה = ניתן לאכסן ערך משתנה כלשהוא
    // הדפסה לא נחשב החזרה !!!
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" enter name : ");
        String userName=input.nextLine();

        nameInStars(userName);
    }

    /*לשים את שם המשתמש בריבוע כוכביות */
    private static void nameInStars(String name) {
        printLine(name.length()+4);// מכיוון שסטרינג הוא סוג של מערך ניתן להשתמש ב Length
        System.out.println("* "+name+" *");
      printLine(name.length()+4);//הוספנו 4 על מנת לציירנ יפה יותר
    }

    public static void printLine(int size){
        for (int counter=0;counter<size;counter++){
            System.out.print("*");
        }
        System.out.println();
    }

}
