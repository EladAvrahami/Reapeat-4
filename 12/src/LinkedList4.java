import java.util.LinkedList;

public class LinkedList4 {


    //ArrayList - משתמש ביותר כוח מהמעבד משום שכל פעם מוחק ויוצר מערך חדש
    /* The ArrayList class has a regular array inside it.
     When an element is added, it is placed into the array. If the array is not big enough,
     a new, larger array is created to replace the old one and the old one is removed.*/


    //LinkedList -משתמש ביותר זיכרון משום שלכל ערך יש תא משלו בזיכרון תמכאן שמקצה מקום בזיכרון לכל איבר בנפרד עם כתובת לאיבר הבא
    //*********************ללינק ליסט יש את אותם שיטות כמו לארייליסט*************
    /*The *****LinkedList**** stores its items in "containers."
    The list has a link to the first container and each container has a link to the next
     container in the list. To add an element to the list, the element is placed
      into a new container and that container is linked to one of the other containers in the list.*/



    //******************** מאוד מזכיר מבחינת יכולות את המערך בגאווה סקריפט*******************

    //לרשימה מקושרת יש גם הרבה יתרונות נוספים כמו הוספה /החסרה מערך ראשון יש כבר פונקציות מוכנות
    //יש גם פונקציה שבמידה ומוצאת פריט ברשימה בעל ערך מסויים עושה משהו ..
        public static void main(String[] args) {
            LinkedList<String> cars = new LinkedList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("BMW");
            cars.add("Mazda");


            // Use removeFirst() remove the first item from the list
            cars.removeFirst();
            //מבטל מופע ראשון בעל ערך מסויים
            cars.removeFirstOccurrence("BMW");
            //מבטל מופע אחרון בעל ערך מסויים
            cars.removeLastOccurrence("Mazda");
            cars.addLast("Opel");
            cars.addFirst("mercedes");
            //האם מכיל משהו ?
            System.out.println( cars.contains("BMW"));

            System.out.println(cars);
        }
}
