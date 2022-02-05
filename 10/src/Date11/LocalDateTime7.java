package Date11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime7 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("now is : " + ldt);

        //לוקח ערך שנוצר ומדפיס אותו בהתאם לסגנון שנרצה
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(" and now is : " + ldt.format(dtf));
    }
}
