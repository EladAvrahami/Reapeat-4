import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {

        //example 1 :
       /*
        Scanner scanner = new Scanner(System.in);
        char op;
        int num1, num2, res;
        boolean opOK = true;
        System.out.println(" enter math expiration: (with space)");
        num1 = scanner.nextInt();
        op = scanner.next().charAt(0);
        num2 = scanner.nextInt();

       switch (op){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num1-num2;
                break;
            case '*':
                res=num1*num2;
                break;
            default:
                opOK=false;

                break;

        }*/

        //example 2:
        Scanner input=new Scanner(System.in);
        int day=0;
        System.out.println("enter day num 1-7");
        day=input.nextInt();
        switch (day){
            case 1://nמכיוון שאין ברייק אחרי הקייס ישמיך הלאה עד קייס 5 בו יש ברייק לאחר הדפסת יום עבודה
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" working day");
                break;
            case 6:
                System.out.println(" cleaning day");
                break;
            case 7:
                System.out.println(" shabessss");
                break;
            default:
                System.out.println(" incorrect value");
        }



    }
}
