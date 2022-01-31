import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String [] victims;
        Scanner s =new Scanner(System.in);
        System.out.println( " enter num of victims: ");
        int victimNumber=s.nextInt();
        s.nextLine();/*לנקות באפפר */
        victims=new String[victimNumber];// קלט משתמש המגדיר גודל המערך
        for (int i=0;i<victims.length;i++){//i מייצג את המקום  במערך
            System.out.println(" enter victim name : ");
            victims[i]=s.nextLine();
        }
        System.out.println(" victims are : ");//מעבר על איברי המערך והדפסתם
        for (int i=0;i<victims.length;i++){
            System.out.println(victims[i]);
        }


    }
}
