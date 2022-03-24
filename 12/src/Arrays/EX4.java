package Arrays;

//Write a Java program to calculate the average value of array elements
public class EX4 {
    public static void main(String[] args) {

        float a [] ={10,30,15,12};
        float sum =0;
        for (float i:a){
            sum+=i;
        }
        float avg=sum/a.length;
        System.out.println(avg);

    }
}
