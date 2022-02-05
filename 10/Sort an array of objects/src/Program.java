import java.util.Scanner;

//less 10 until 1:54
public class Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many persons? ");
        int total=input.nextInt();//גודל המערך ייקבע עי ההכנסה של המשתמש
        Person[] persons=getDataFromUser(total);//by ref -> memory address
        //Person[] persons=getDataFromFile();
        Person[] people_sort_thin2fat=thin2fat(persons);
        Person[] people_sort_height2low=height2low(persons);
        System.out.println("original array:");
        printArray(persons);
        System.out.println("\n thin2fat array: ");
        printArray(people_sort_thin2fat);
        System.out.println("\n high to low array: ");
        printArray(people_sort_height2low);

    }

    private static Person[] getDataFromUser(int total){
        Person[] persons=new Person[total];
        Scanner input=new Scanner(System.in);
        for (int i =0;i<persons.length;i++){
            System.out.println("enter Height and wight:");
            persons[i]=new Person();
            persons[i].setHeight(input.nextInt());
            persons[i].setWeight(input.nextInt());
            System.out.println("Enter name: ");
            persons[i].setName(input.nextLine());
            input.nextLine();
        }
        return persons;
    }

    private static Person[] getDataFromFile(){return null;}

    //method
    private static Person[] thin2fat(Person[] persons){
        Person[] returnResult=persons;
        for(int i=0;i< returnResult.length;i++){
            //iterate on column
            for (int j=0;j< returnResult.length-1;j++){
                Person temp;
                if (returnResult[j].getWeight()>returnResult[j+1].getWeight()){
                    temp=returnResult[j];
                    returnResult[j]=returnResult[j+1];
                    returnResult[j+1]=temp;
                }

            }
        }

        return returnResult;
    }

    private static Person[] height2low(Person[] persons){
        Person[] returnResult=persons;

        return returnResult;
    }

    private static void printArray(Person[] persons){}


}
