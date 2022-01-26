import java.util.Scanner;

//חישוב סכום ספרותיו של מס
public class clculateNumDigits5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, sum=0;
        System.out.println( " enter num: ");
        num =s.nextInt();

        while (num!=0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(" sum of it digits is : "+sum);
    }
}
