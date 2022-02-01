public class StringProblem11 {
    //string  - חי ב heap
    //סטרינג כל פעם יוצר מופע חדש בזיכרון ואפעם לא נמחק

    //string -immutable - לא ניתן למחיקה כל שינוי אובייקט סטרינג יוצר אובייקט חדש
    //כל פעם שארצנ לשנות משהו הערך גדל כלומר מופיע לי עוד מופע כמו שורה 10
    public static void main(String[] args) {
        String txt;
        txt="elad";
        txt="elad avrahami";// אעפי שהייתי חושב שהטקסט השני ימחק את הראשון לא כך הדבר אלא ההפניה הקודמת בזיכרון עדיין יהי קיים
        txt+="student";
        txt+="2022";
        System.out.println(txt);


    }
}
