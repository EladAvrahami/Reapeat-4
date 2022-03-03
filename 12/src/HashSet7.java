import java.util.HashMap;
import java.util.HashSet;

public class HashSet7 {

//hashSet is a collection of items that each element is unique

    public static void main(String[] args) {
        //even that BMW  appear twice there is just one at the print
        HashSet<String> cars=new HashSet<String>();
        cars.add("AR");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Pejo");
        cars.add("BMW");
        cars.add("Mazda");

        System.out.println(cars);

        System.out.println(cars.contains("Pejo"));
        cars.remove("AR");
        //and also has the method clear(),size()


        /* regular for loop to print the items at hash set
        * for(int i =0;i<cars.size;i++){sout(i)} */

        //better way :
       /* for (String i:cars){
            System.out.println(i);
        }
        */

        //best way :
       cars.forEach(System.out::println);





    }

}
