package Arrays;

import java.util.Arrays;

// Write a Java program to copy an array by iterating the array.
public class EX8 {
    public static void main(String[] args) {

        int a []={10,20,30,55,12,16};
        int new_array[]=new int[6];

        for (int i=0;i<new_array.length;i++){
            //שים לב שמשווה לפי הסדר משום שאם תשווה הפוך יאתחל ב 0 את המערך המלא
            new_array[i]=a[i];
        }
        System.out.println("the new array is "+ Arrays.toString(new_array));

    }
}
