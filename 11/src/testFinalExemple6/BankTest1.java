package testFinalExemple6;

import FinalBankExam6.HackTheBankEvenWithGetterModifaierProtec2;
import FinalBankExam6.User;

public class BankTest1 {
    public static void main(String[] args) {
        User user=new User();
        //System.out.println(user.getPassword());


        /* תוריד את המילה Final  ממחלקת USER על מנת לראות את נפריצה עובדת */
        //בעצם כאשר איןאת המילה Final במחלקת USER ניתן יהיה לדרוס שיטות וערכים עי הורשה
        //ובכך לתת מתן אפשרות לצפייב בסיסמא
        HackTheBankEvenWithGetterModifaierProtec2 userHackWithoutFinal=new HackTheBankEvenWithGetterModifaierProtec2();
        //System.out.println(userHackWithoutFinal.getPassword());

    }
}
