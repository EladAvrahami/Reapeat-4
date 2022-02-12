package Animal8;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog=new Dog(4,true,"brown","7687-6856-5675");
        Cat cat =new Cat(4,true,"grey",7);

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
