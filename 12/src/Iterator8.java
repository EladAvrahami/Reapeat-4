import java.util.*;

public class Iterator8 {

    //i most likely use iterator trow a colletion such as ArrayList and HashSet
    public static void main(String[] args) {

        //make a collection
        ArrayList<String>animals=new ArrayList<String>();
        animals.add("shark");
        animals.add("lion");
        animals.add("dog");

        //get iterator
        Iterator<String> iterator=animals.iterator();
        // .next() מחזיר את ערך האיבר הבא
        System.out.println(iterator.next());

        //.hasNext() - מחזיר אמת במידה ויש איבר הבא
        while (iterator.hasNext()){
            System.out.println(iterator.next());}


            System.out.println("*********************************************");

        System.out.println("pay attention that for loop or forEach loop wouldn't work because the collections chang " +
                "its size at the same time the code is trying to loop ");
            //remove () in loop :

            ArrayList<Integer> nums=new ArrayList<Integer>();
            nums.add(12);
            nums.add(2);
            nums.add(6);
            nums.add(11);
            nums.add(20);
            System.out.println(nums+" before remove ");


            Iterator<Integer>it=nums.iterator();
            while (it.hasNext()){
                Integer i = it.next();
                if (i<10){
                    it.remove();
                }
            }
            System.out.println(nums+" after remove() less than 10 ");


        }




    //מצגת אוספים עמוד 14
        /* על איבריו של Vector ניתן לעבור בלולאה רגילה כמו שעוברים על מערך
ישנם אוספים אשר לא מאפשרים מעבר באמצעות [ ] אלא באמצעות אובייקט הנקרא איטרטור (Iterator) שהוא למעשה הפניה לאיבר כלשהו באוסף
לכל אוסף יש את השיטה iterator() המחזירה איטרטור לאיבר הראשון באוסף
לאובייקט מטיפוס איטרטור יש 2 שיטות המאפשרות לעבור על כל איברי האוסף:
hasNext המחזירה true במידה ויש איברים נוספים
next המחזירה את ערך האיבר הבא */

       /*Scanner s =new Scanner(System.in);
        System.out.println("enter 3 animals : ");
        for (int i=0;i<3;i++){
            s.nextLine();

        }
        System.out.println(" the animals are: "+animals.toString());


*/

      /*  System.out.println("enter nim of Ingredients");
        int numberOfIngredients = s.nextInt();
        LinkedList<String> ingredientLinkedList = new LinkedList<String>();
        for (int i = 0; i< numberOfIngredients; i++){
            System.out.println("Ingredient number "+i+"is :");

            String ingredientName = s.nextLine();

            ingredientLinkedList.add(ingredientName);

           // double pricePerOunce = s.nextDouble();
            //boolean isVegetarian = s.nextBoolean();
            //int numberOfCalories = s.nextInt();

           // ingredientLinkedList.add(pricePerOunce);

        }// ends for loop to fill the ingredientArray
        System.out.println(ingredientLinkedList);
*/
    }

