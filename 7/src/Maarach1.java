public class Maarach1 {
    public static void main(String[] args) {
        // מערך אוסף של משתנים מאותו סוג עם שם טחד ובעלי תפקיד זהה
        //<type>[]<var_name> =new<type>[SIZE] תבנית
        int[] numbers=new int[20];
        char[] letters=new char[10];

        //כאשר יש הפניה לתא בזיכרון ואותו תא ריק בעיה זו נקראת null pointer exception
        //איבר אחרון במערך תמיד יהיה size -1
        //משום שמערך מתחיל מתא מס 0

        /*גישה לאיברי המערך */
        int[] arr=new int[3];//גודל המערך הוא 3
        arr[0]=4;
        arr[1]=7;
        arr[2]=3;
        System.out.println(arr[0]+" "+arr[1] +" "+arr[2]);
        System.out.println( arr.length+"באמצעות arr.length נמצא את גודל המערך שהוא במקרה זה :  ");




    }
}
