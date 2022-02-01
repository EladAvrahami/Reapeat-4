import java.util.Scanner;

public class equalesStringByValAndRef12 {
    //4:45
    public static void main(String[] args) {
        //שלב 1
        Scanner s =new Scanner(System.in);
        int x1 =3 ,x2=5;
        System.out.println("before:x1==x2 ?"+(x1==x2));//F
        x1=5;
        System.out.println("after: x1==x2 ?");//T


        //שלב 2
        //בדיקת שיוויון אובייקטים באמצעות = = בודק אם האובייקטים מפנים לאותו מקום
        //בדיקת שיוויון באמצעות equals בודקת שיוויון תוכן
      /*  String str1="hello";
        String str2;
        System.out.println(" enter \"hello\" :");
        str2= s.nextLine();

        System.out.println("str1==str2 ? :"+(str1==str2));//F
        System.out.println("str1 equals str2 ? :"+str1.equals(str2));//T

        str1=str2;
        System.out.println("str1==str2 ? :"+(str1==str2));//T
        System.out.println("str1 equals str2 ? :"+str1.equals(str2));//T
        */


        //שלב 3
        //במידה והייתי עושה עם סטרינג רגיל היו לי 5 מופעים בשיטה זו ישלי רק אחד
        StringBuffer myName=new StringBuffer();
        myName.append("Elad ");
        myName.append("avrahami ");
        myName.append("2022");
        System.out.println(myName);
        //System.out.println(myName.reverse());// כתב מראה נשתמש ברברס

        //System.out.println(   myName.delete(2,5));//מחיקה בין מקומות של אותיות ספציפיים
        System.out.println(myName.replace(0,4,"*****"));//קח את כל התווים ממקום 0-4 ותחליף ב****

        String str="2022";
        int year=Integer.parseInt(str);// הפיכת סטרינג למס

        String makeIntToString=String.valueOf(2021);//הפיכת מס לסטרינג 


    }
}
