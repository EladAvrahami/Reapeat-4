package ex2Codility;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(initializeArrOddNumSize());
        int[] arr = new int[7];
        System.out.println(arr.length + " is the array length");
        System.out.println(Arrays.toString(initializeArrWhitOddNum(arr)));
        System.out.println("********************************");
        //System.out.println(solution1(arr));

        int arr1[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };

        System.out.println(isUnique(arr1));
        //System.out.println(moreThan1(arr1));
        /*System.out.println(Arrays.toString(arr1));
        int n = arr.length;
        countFreq(arr1, n);*/






    }




  /* public static int solution1(int[] A) {
        // write your code in Java SE 8
        //int[] newArray = new int[A.length];
        for (int i=0;i<A.length;i++){
            int tempCheck=0;



        }


    }*/


/*
     int lonly = 0;
        for (int i = 0; i < A.length; i++) {
            int cellCounter2times = 0;
            for (int counter = 0; counter < newArray.length; counter++){
                if (A[i] == A[counter + 1]) {
                    cellCounter2times++;
                    if (cellCounter2times >= 1) {
                        cellCounter2times = 0;
                        return -1;
                    } else lonly = A[i];

                }
                }
        }
        return lonly;*/


    public static boolean isUnique(int[] arr){
        int []tempArr=arr;
        Arrays.asList(tempArr);
        // https://www.geeksforgeeks.org/program-to-convert-array-to-list-in-java/

        for (int i=0;i<arr.length;i++){
            int count=0;
            int locationFirstArr=arr[i];
            for (int j=0;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
                if (count>=1){
                    return false;
                }else if (count==0){
                    return true;
                }
            }

        }
        return false;
    }


    public static int[] initializeArrWhitOddNum(int[] array) {
        int[] TempArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            TempArray[i] = RandomOddNum();
        }
        return TempArray;
    }


    public static int RandomOddNum() {
        int N = ((int) (Math.random() * 25 + 3));
        // System.out.println("the random first num is :"+ N);
        if (N % 2 == 0) {
            return N + 1;
        } else return N;

    }


}
