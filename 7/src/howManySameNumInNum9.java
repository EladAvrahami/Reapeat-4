import java.util.Scanner;
//מצא כמה פעמים מופיע מס בספרה ארוכה
public class howManySameNumInNum9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]array=new int[10];//משום שיש 10 ספרות אפשריות
        System.out.println("enter num :");
        int number=input.nextInt();
        int temp=number;
        while (temp>0){
            int digit=temp%10;
            temp/=10;
            array[digit]+=1;
        }
        for (int i=0;i<array.length;i++){
            if (array[i]>0)
            System.out.printf("the num %d appear %d times.",i,array[i]);
            System.out.println();
        }

    }
}
