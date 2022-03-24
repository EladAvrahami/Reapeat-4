package Arrays;

//Write a Java program to find the index of an array element
public class EX6 {
    public static void findIndex(int arr[],int num){
       for (int i =0;i<arr.length;i++){
           if (num!=arr[i]){
               System.out.print(i);
           } //else System.out.println(num +" is not in the array");
       }
    }

    public static void main(String[] args) {
        int a []={10,20,30,55,12,16};
        System.out.print("index of num 12 is : "); findIndex(a,21);



    }
}
