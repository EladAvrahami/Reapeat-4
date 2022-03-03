import java.util.HashMap;

public class HashMap5 {
    /* A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type
    * One object is used as a key (index) to another object (value).
    *  It can store different types: String keys and Integer values,
    *  or the same type, like: String keys and String values: */
    public static void main(String[] args) {

        HashMap<String,String> capitalCities =new HashMap<String,String>();

        //Adding to hashMap to key value String types by using the "put" method:
        capitalCities.put("england","London");
        capitalCities.put("Israel","jerusalem");
        capitalCities.put("Germany","Berlin");
        System.out.println(capitalCities);

        //to get into value in hash map i will use the get() method and mention my cell key:
        System.out.println(capitalCities.get("Israel"));

        //to delete any value from it use remove() method :

        capitalCities.remove("england");
        System.out.println(capitalCities);



        //כדי לשכפל את הרשימה לאובייקט מסויים נשתמש במתודת clone()
       Object cities= capitalCities.clone();
        System.out.println(cities+ " this is clon hashMap");

        //to remove all the items use clear() method :
       // capitalCities.clear();
      //  System.out.println(capitalCities+"empty after clear method");

        System.out.println(" size method will tell me how many items there are :");
        System.out.println(capitalCities.size());



    }



}
