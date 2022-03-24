package Arrays;

//Print square of # 10x10

public class EX3 {
    public static void main(String[] args) {
        int numOfRow=10;
        int numOfCol=10;
        int [][] array=new int[numOfCol][numOfRow];

        for (int i =0;i< array.length;i++){
            for (int j=0;j< numOfRow;j++){
                System.out.print(" # ");
            }
            System.out.println("");
        }
    }


}
