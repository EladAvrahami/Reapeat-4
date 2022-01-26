public class NestedFor2 {

    // או הדפסת ריבוע דוגמא ללוח הכפל
    public static void main(String[] args) {
        System.out.println( "multiple bored \n ========================" );
        for (int row=1;row<=10;row+=1){//כל עוד באיטרציה הראשונה ידפיס ראת התוצאות שבאיטרציה הבאה בשורה הראשונה
           for (int col=1;col<=10;col+=1){
              // System.out.print(col*row+" ");
               System.out.printf("%4d",row*col);//צורת הדפסה עם רווחים יפים יותר
           }
            System.out.println();
        }
        System.out.println();
    }
}
