public class shortLoopItem8 {
    public static void main(String[] args) {
        String[]people={"elad","mayyan","ofer","zeev"};

        //regular way :
        for (int i =0;i<people.length;i++){
            System.out.println(people[i]);
        }

        System.out.println("*shorter way will be :  ");
        /*shorter way will be : */
        for (String item:people){
            System.out.println(item);
        }



    }
}
