package Arrays;

import java.util.Arrays;

//Write a Java program to test if an array contains a specific value
public class ex5 {

    public static boolean contain(int arr[],int num ){
        for (int i:arr){
            if (num==i){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int a []={10,20,30,55,12,16};
        System.out.println( " the array is "+Arrays.toString(a));
        System.out.println(contain(a,1));
    }
}
