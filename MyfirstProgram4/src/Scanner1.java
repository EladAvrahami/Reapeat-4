import java.util.Scanner;/*scanner library implement to our java program*/

public class Scanner1 {
    public static void main(String[] args) {
        System.out.println("print anything with sout");

        //when u want java will be able to take input from user we will use Scanner
        //getting scanner obj
        Scanner input=new Scanner(System.in);

        //get a num into a variable
        System.out.println(" enter num: ");
        int num =input.nextInt();/*int = מס שלם */
        System.out.println( " your num is "+num);

        double num2 =input.nextInt();/*double = מס עשרוני */
        System.out.println( " your num is "+num2);




    }
}
