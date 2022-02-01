package MizrachiPublic5;

public class Tester5 {
    public static void main(String[] args) {
         Users5 admin=new Users5();
         admin.user="admin";
         admin.password="GOD";
         //לכאורה הכל טוב כי יציג לי שקר ואין התחברות
        System.out.println("user is admin:"+admin.isAdmin("admin","12345"));
        //בתכלס יש בעיה i can hack the system(:
        admin.password="12345";//בגלל שלא רשמתי את הסיסמא כפריווט זה נותן גישה לשנות את הסיסמא או
        //לחילופין נתונים אחרים שגם לא מוצהרים כפריווט
        System.out.println("user is admin:"+admin.isAdmin("admin","12345"));



    }
}
