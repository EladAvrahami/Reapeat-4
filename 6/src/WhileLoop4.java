import java.util.Scanner;

public class WhileLoop4 {
    // לולאה בהתאם לתנאי
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num ,counter=0 ,sum=0;
        System.out.println(" enter nums ,-1 stop the program ");
        num = s.nextInt();
        while (num !=-1){
            sum +=num ;
            counter+=1;
            System.out.println( " enter more num : (or -1 to stop )");
            num =s.nextInt();
        }
        System.out.println(" average of the "+counter +" U entered is: "+(float)sum/counter);


    }
}
