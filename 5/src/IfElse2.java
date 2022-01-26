import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
       /* if (expression)
            statment
            */
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, max;
        System.out.println(" enter 3 nums");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        /*if (num1>num2 && num1>num3){//ביטוי לוגי מורכב
            System.out.println( num1+" is the maximum");
        }else {
            System.out.println("the max is "+num2+" or "+num3);
        }*/

        //קונטרול אלט L זה חוויה
        if (num1 > num2 && num1 > num3) {//ביטוי לוגי מורכב
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("max num is "+max);

    }

}



