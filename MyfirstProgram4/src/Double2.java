import java.util.Scanner;

public class Double2 {
    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);
        double price ;/*double = מס עשרוני */
        double totalPrice ;
        double Taxes;
        final double FIXEDTAX; /*final- הגדרת קבוע מערכת נהוג לרשום באותיות גדולות */
        /*ברגע שהוספנו פיינל לא ניתן לשנות את הערך שהוגדר בהמשך התוכנית */

        System.out.println("enter price: ");
        price = s.nextDouble();
        System.out.println("enter tax for today");
        Taxes=s.nextDouble();
        totalPrice=price+(price*Taxes/100);
        System.out.println("Total price include"+Taxes+"% tax is "+totalPrice);

    }
}
