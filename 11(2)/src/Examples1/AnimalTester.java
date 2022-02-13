package Examples1;

import Interfaces2.SoundAble;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog=new Dog(4,true,"brown","7687-6856-5675");
        Cat cat =new Cat(4,true,"grey",7);

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());

        TV MyTv=new TV();
        Car MyCar=new Car();

        //אני יכטל לעשות את הדבר הזה מכיוון שלכולם יש גורם משותךף ממשק  soundAble
        SoundAble[] myItem=new SoundAble[4];
        myItem[0]= dog;
        myItem[1]=cat;
        myItem[2]=MyTv;
        myItem[3]=MyCar;

        System.out.println("לקיחת איברים בעלי מכונה משותף ולחבר בניהם ");
        System.out.println("for each loop of sounds: *********");
        //את הדוגמא למעלה ניתן לרשום גם כך :
        //ניתן להכניס את כולם לאותו מערך כי הם מאותו סוג משום שהם כולם בעלי אותו ממשק soundAble
        //יש לכולם אבא אינטרפייס משותף
        SoundAble[] myItem2={dog,cat,MyCar,MyTv};//פולימורפיזם -polyMorphism
        //נשתשמש בלולאת for each על מנת להדפיס
            //   האיבר            האוסף
        for (SoundAble item :myItem2){
            System.out.println(item.makeSound());
        }


    }
}
