package MizrachiPublic5;

public class Users5 {
    //על מנת לפתור את הבעיה שנוצרת בטסט בו הנתונים הללו ניתנים לשינוי עי היוזר נחליף את פובליק ב privet
    public String user,password;

    //במידה וקיבלתי סיסמא ושם משתמש נכונים תחזיר אמת
    public boolean isAdmin(String loginUser, String loginPassword){
        return user.equals(loginUser)&&password.equals(loginPassword);
    }

    //דוגמא לשיטה שלא תוחצן החוצה לטסט מכיוון שפריווט
    private void printTest(){
        System.out.println("this is a test");
    }
}
