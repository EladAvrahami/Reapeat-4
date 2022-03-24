package Arrays;

import java.util.Arrays;

//Write a Java program to sum values of an array
public class EX2 {
    public static void main(String[] args) {
        int[] nums={ 11,2,7,5};
        int sum =0;
        System.out.println(Arrays.toString(nums)+ "original array name 'nums'");
        for (int i =0;i< nums.length;i++){
            sum+=nums[i];
        }
        System.out.println(sum +"my sum");


        //if  מקוצר
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        for (int item : my_array)
            sum1 += item;
        System.out.println("The sum is " + sum1);
    }






}
