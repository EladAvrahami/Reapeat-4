import java.util.ArrayList;
import java.util.Collections;

public class AarrayList3 {
    public static void main(String[] args) {

        /*The difference between a built-in array and an ArrayList in Java,
         is that the size of an array cannot be modified
         (if you want to add or remove elements to/from an array, you have to create a new one).
          While elements can be added and removed from an ArrayList whenever you want.
         The syntax is also slightly different: */

        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add("mecedec");
        cars.add("toyota");


        System.out.println(cars);
        System.out.println( cars.get(0) +" get val of cell 0 of the ArrayList ");
        cars.set(0,"bmw");
        System.out.println(cars.get(0)+ " now with the new value that i set");
        cars.remove(0);
        System.out.println(cars+" remove delete specific arrayList cell ");
        //cars.clear();
        System.out.println( " cars.clear(); will remove all the elements in the ArrayList ");

        System.out.println("cars.size(); bring array size : ");
        System.out.println(cars.size());


        System.out.println(" FOR loop *****************");
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);numbers.add(15);
        for (int i =0;i<numbers.size();i++){
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("FOR EACH loop ***************");
        for (Integer item: numbers){
            System.out.println(item+"ForEachForEachForEachForEachForEachForEach");
        }




        ArrayList<String> car2=new ArrayList<>();
        car2.add("Volvo");
        car2.add("Toyota");
        car2.add("AMazde");
        car2.add("Lamborghini");
        Collections.sort(car2); //collection.sort() will sorting lists alphabetically or numerically:
        for ( String i:car2){
            System.out.println(i);
        }
    }
}
