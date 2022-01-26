import java.util.Scanner;

public class printTriangle3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int base;
        System.out.println(" enter base of the triangle: ");
        base = s.nextInt();
        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("triangle other side example");
        // triangle other side example :
        final int BASE=5;
        for (int row =1;row <=BASE;row++){
            System.out.print(" ");
            for (int counter=1;counter<BASE-row;counter++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
