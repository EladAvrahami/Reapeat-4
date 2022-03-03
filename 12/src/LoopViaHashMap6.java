import java.util.HashMap;
import java.util.Iterator;

public class LoopViaHashMap6 {

    public static void main(String[] args) {

        //  האש מאפ יכיל בתוך סימן התגית את סוגי הטיפוסים שמקבל מבחינת מפתח ערך
        //במקרה זה המפתח הוא מסוג מס טהערך מסוג סטרינג
        HashMap<Integer,String> nums=new HashMap<Integer,String>();
        nums.put(1,"one");
        nums.put(2,"two");
        nums.put(3,"three");
        nums.put(4,"four");



        /*System.out.println("SHORT froEach is so COOL ! ");
        nums.keySet().forEach(System.out::println);*/

        //for each loop in hash map
        //method keySet() -to get trow the keys of it or

        System.out.println(" 3 ways to use keySet() : ");

        System.out.println();
        System.out.println("first by for each loop ");
        for (int i:nums.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("2. by regular loop + iterator :");
        for (Iterator<Integer> iterator = nums.keySet().iterator(); iterator.hasNext(); ) {
            int i = iterator.next();
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("3. shorted for each loop :");
        nums.keySet().forEach(System.out::print);


        //use method values() -to get the values

        System.out.println();
        for (String s: nums.values()){
            System.out.print(s +" ");
        }

        System.out.println();
        nums.values().forEach(System.out::println);


        System.out.println("To print keys and values of the hash :");
        for (int i:nums.keySet()){
            System.out.println("key: "+i+"  value: "+ nums.get(i));
        }
    }
}
