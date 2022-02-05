package addElemantToArrayProperty7;

public class test {
    public static void main(String[] args) {
        Student s=new Student("elad",3);
        s.addSubject("algebra");
        s.addSubject("java");
        s.addSubject("para para");

        s.show();
    }
}
