import java.util.Arrays;

/*
 * 1הגדר שני מערכים שמספרים בגודל 15 מס1 מס2 ומאתחלת אותם בספרות באופן אקראי
 * ספרות יכולות להופיע כמה פעמים באותו מערך
 *
 *
 * הקלטה 12 דקה 56
 * */
public class Tester {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 15;
        //create tow arrays and fill the numbers inside
        int[] arr1 = fillArray(ARRAY_SIZE);
        int[] arr2 = fillArray(ARRAY_SIZE);
        int[] distinct=fillNeg(10);//יצירת מערך חדש שיכיל את על המס שמיוחדים בכל מערך


        System.out.println(printArray(arr1));
        System.out.println();
        System.out.println(printArray(arr2));
        System.out.println("-----------------------------------");
        System.out.println(findBigThree(arr1));
        System.out.println(findBigThree(arr2));
        System.out.println("-----------------------------------");
        System.out.println("FIND UNIQUE:");
        findUnique(arr1,arr2,distinct);

        System.out.println(Arrays.toString(distinct));

    }

    //שלב 1 : בנייה של פונקציה המקבלת לתוכה מערך by ref
    //ממלאה את המערך שהתקבל תוכה במספרים רנדומלים
    public static int[] fillArray(int arraySize) {
        int returnArray[] = new int[arraySize];
        for (int counter = 0; counter < returnArray.length; counter++) {
            returnArray[counter] = (int) (Math.random() * 10);
        }
        return returnArray;//החזרה של המערך לאחר מילוי
    }

    //https://www.geeksforgeeks.org/stringbuffer-class-in-java/
    public static String printArray(int[] arr) {
        StringBuffer sf = new StringBuffer();
        for (int item : arr) {
            sf.append(item);
            sf.append(" ");
        }
        return sf.toString();
    }

    /*  StringBuffer sf = new StringBuffer();
        for (int item : arr) {
            sf.append(item);
            sf.append(",");//הבפיל לי את מס התווים בעצם
        }
        sf.deleteCharAt(arr.length*2-1);//על מנת לבטל את הפסיק בסוף כל מערך האמצעות הפקודה דליט-צאר
        return sf.toString();*/

       /* for (int item:arr){
            System.out.println(item +",");
        }*/

    //מוצא  מהמערך הרנדומלי שיצרנו את המס הגדול ביותר שמורכב מ3 ספרות עוקבות
    public static int findBigThree(int[] arr) {
        int theBig = 0;//צירוף ספרות הכי קטן יהיה 0
        for (int counter = 0; counter < arr.length - 2; counter += 1)
        {
            int myNum = arr[counter] * 100 + (arr[counter+1] * 10) + arr[counter+2];
            if (myNum > theBig)
            {
                theBig = myNum;
            }
        }
      return theBig;
    }


    public  static void findUnique(int[]arr1,int[]arr2,int[] distinct){
       int[] myArray=fillNeg(10);
       //check first array
       for (int counter=0;counter< arr1.length;counter++){
           if (myArray[arr1[counter]]<0){//
                myArray[arr1[counter]]+=1;
           }
       }
       //check second array
        System.out.println(printArray(myArray));
    }

    //מאתחל את המערך בגודל שהמשתשמ יכניס את כל התאים ל 1-
    private static int[] fillNeg(int size){
        int[] returnArray=new int[size];
        for (int counter=0;counter<returnArray.length;counter+=1){
            returnArray[counter]=-1;
        }
        return returnArray;
    }

     /*  int disCounter=0;
        for (int counter1=0;counter1< arr1.length;counter1++)
        {
            for (int counter2=0;counter2< arr2.length;counter2++)
            {
                if (arr1[counter1]!=arr2[counter2])
                {
                    distinct[disCounter]=arr1[counter1];

                }
            }
            disCounter++;
        }
        return distinct;
    }*/
}
