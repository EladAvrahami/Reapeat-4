package FinalBankExam6;


//ברגע שמחלקה מוגדרת כFinal לא ניתן לרשת ממנה
//כאשר שיטה מוגדרת כFinal לא ניתן לדרוס אותה
 public class User {
    private String password="this is admin pass";

   final protected String getPassword() {//מרגע שרשמנו פרוטקטד בגטטר המיין bankTest1 לא תוכל לקבל את הסיסמא
        return password;
    }



}
