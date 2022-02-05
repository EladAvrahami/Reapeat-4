public class this10 {
    //5:00
    //שימוש בthis  על מנת לחסוךך מקום בקונסטרקטורים

    private  int min , hours;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
      if (min<0 || min>59){
          this.min=0;
          return;
      }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    /*שיטה ראשונה לבניית 3 סוגי קונסטרקטור או יותר רחמנא ליצלן (דרך ארוכה ללא this): */

    //קונסטרקטור עם שני הערכים
   /* public this10(int min, int hours) {
        this.min = min;
        this.hours = hours;
    }

    //קונסטרקטור עם רק אחד מהם
    public this10(int hours) {
        this.hours = hours;
        setMin(0);
    }
    //דיפולטיבי שאתחלנו בכוח-גם אם לא הייתי רושם כלום עדיין היה 0 במידה ולא אזין פרמטרים בטסטר
    public this10(){
        setMin(0);
        setHours(0);
    }
    */



    /*שיטה שניה לבניית 3 סוגי קונסטרקטור עם this): */

    //טכניקה זו נקראת שחרור צימוד - Loss coupling
    //בהתאם לקבלת הפרמטרים בטסטר ידע לאיזה בנאי ללכת ולהשתמש

    public this10(int min, int hours) {
        this.min = min;
        this.hours = hours;
    }
    //בשיטה זו במידה וארצה לשנות את אחד מערכי הבנאי מספיק יהיה לשנות רק בקונסטרקטור הראשון וגם השניים למטה ישתנו בהתאם
    //בגלל שהשתמשתי במילה this בתוכם
    public this10(int min){
        this(min,0);
    }

    public this10(){
        this(0,0);
    }

}
