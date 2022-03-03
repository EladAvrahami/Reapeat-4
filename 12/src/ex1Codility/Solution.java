package ex1Codility;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] arr1 = intiallizeArrayRandomNum(4);
        System.out.println("**********************************");
        System.out.println("The original initialized array is: "+Arrays.toString(arr1));
        //System.out.println(Arrays.toString(RotationArray(arr1)));
        System.out.println("**********************");

        System.out.println("final array after k rotation is: "+Arrays.toString( solution1(arr1, 5)) );


    }


    //k כמות הפעמים שהמתודה תרוץ לולאה
    //המערך שיתקבל
    public static int[] solution1(int[] A, int K) {
        // write your code in Java SE 8
        int[]tempArray=new int[A.length];
        for (int i = 0; i < K; i++)
        {
            System.out.println("array before method: "+ Arrays.toString(A));
           System.out.println("array after method: "+ Arrays.toString(RotationArray(A)) );
           tempArray=RotationArray(A);
           A=tempArray;

        }

        return A;
    }

    //יוצר מערך סיבובי אחד
    public static int[] RotationArray(int[] A) {
        int[] TempArray = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            TempArray[0] = A[A.length - 1];
            TempArray[1] = A[0];
            TempArray[i] = A[i - 1];
        }
        return TempArray;

    }

    //מחלקת עזר למלא מס מס במערך
    public static int[] intiallizeArrayRandomNum(int arraySize) {
        int returnArray[] = new int[arraySize];
        for (int counter = 0; counter < returnArray.length; counter++) {
            returnArray[counter] = (int) (Math.random() * 9 + 1);
        }
        return returnArray;

    }


}
