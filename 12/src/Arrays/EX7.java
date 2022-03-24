package Arrays;

import java.util.Arrays;

//Write a Java program to remove a specific element from an array.
public class EX7 {
    public static void removeFromArray(int arr[],int num){
        for (int i:arr){
            if (i==num){

            }
        }
    }

    public static void main(String[] args) {
        int a []={10,20,30,55,12,16};
        int index=2;

        //i אומר לו מאיפה להתחיל
        //מהנק שמתחיל האינדקס כל תא יהיה שווה לתא הבא אחריו וככה תא אינדקס נעלם
        //עד שמגיעים לתא אחד לפני אחרון כמובן מקום שבתא האחרון לא יהיה תא אחריו ללהשוות ערך אליו
        for (int i =index;i< a.length-1;i++){
            a[i]=a[i+1];
        }
        System.out.println("array after remove index 2 :"+Arrays.toString(a));



/*
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("Original Array : "+ Arrays.toString(my_array));

        // Remove the second element (index->1, value->14) of the array
        int removeIndex = 1;

        for(int i = removeIndex; i < my_array.length -1; i++){
            my_array[i] = my_array[i + 1];
        }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
        System.out.println("After removing the second element: "+Arrays.toString(my_array));

 */
    }
}
