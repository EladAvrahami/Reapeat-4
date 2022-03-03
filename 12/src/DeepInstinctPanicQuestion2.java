import java.util.Arrays;
import java.util.Scanner;

public class DeepInstinctPanicQuestion2 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = intiallizeArrayRandomNum(10);
        System.out.println("****************************** Way 1 : ");
        System.out.println(Arrays.toString(arr2));//שימוש בספריית ארייס עמ להדפיס בקלות מערך
        System.out.println(getThreeBigNum(arr2));
        System.out.println("****************************** Way 2 : ");
        int[] arr3 = intiallizeArrayRandomNum(12);
        System.out.println(Arrays.toString(arr3));
        System.out.println(getThreeBigNum2(arr3));

        System.out.println("++++++++++++++++++++++++++++++++++++");

        Scanner S =new Scanner(System.in);
        System.out.println("enter new array size: ");
        int ArraySize=S.nextInt();
        int[]array4 =getRandomNumInArray(ArraySize);
        System.out.println(Arrays.toString(array4));
        System.out.println(" the biggest number made from 3 next numbers in the array is :  ");
        System.out.println(getThreeBigNum(array4));
        System.out.println("******************** check array as string ***************");
        int[]array5=getRandomNumInArray(10);
        System.out.println(Arrays.toString(array5));
        System.out.println(getArrayStringBack3BigNum(array5));




    }


    public static int getThreeBigNum(int[] anyArray) {
        int biggestNum = 0;
        for (int counter = 0; counter < anyArray.length - 2; counter++) {
            int temp = anyArray[counter] * 100 + anyArray[counter + 1] * 10 + anyArray[counter + 2];
            if (temp > biggestNum) {
                biggestNum = temp;
            }
//            (i * (i + 1) / 2); = sum of 1 to i example i = 5 -> 1 + 2 + 3 + 4 + 5 = 15
        }
        return biggestNum;
    }


    public static int[] intiallizeArrayRandomNum(int arraySize) {
        int returnArray[] = new int[arraySize];
        for (int counter = 0; counter < returnArray.length; counter++) {
            returnArray[counter] = (int) (Math.random() * 10);
        }
        return returnArray;

    }

    /*דרך מס 2 */
    public static int getThreeBigNum2(int[] anyArray) {
        String str = "" + anyArray[0] + anyArray[1] + anyArray[2];
        for (int counter = 3; counter < anyArray.length - 2; counter++) {
            String tempStr = "" + anyArray[counter] + anyArray[counter + 1] + anyArray[counter + 2];
            if (Integer.parseInt(tempStr) > Integer.parseInt(str)) {
                str = tempStr;
            }

        }
        return Integer.parseInt(str);
    }




    public static int[] getRandomNumInArray(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) (Math.random()*10);
        }
        return array;
    }

    public static int getArrayStringBack3BigNum(int[] someArray){
        String str=""+someArray[0]+someArray[1]+someArray[2];
        for (int counter=3;counter<someArray.length-2;counter++){
            String TempString=""+ someArray[counter]+someArray[counter+1]+someArray[counter+2];
            System.out.println("checking more new number as String....");
            if (Integer.parseInt(TempString)>Integer.parseInt(str)){
                str=TempString;
            }
        }
        return Integer.parseInt(str);
    }




}
