import java.util.Scanner;

public class ArrayFindMax3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.printf("enter %d numbers:", arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int maxNum=arr[0];//מציאת ערך האיבר הגדול ביותר במערך
        int maxNumPositin=0;//מציאת מיקום אותו ערך
        for(int i=0;i<arr.length;i++){
            if (arr[i]>maxNum){
                maxNum=arr[i];
                maxNumPositin=i;
            }
        }
        System.out.printf("the num %d is the biggest",maxNum);
        System.out.println();
        System.out.println("the biggest num is at place "+maxNumPositin+" at the array");


    }
}
