public class Person {
   private String name;
   private double height, weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void Show(){
        System.out.printf("name: %s weight: %d height: %d \n",this.name,this.weight,this.height);

    }
}
