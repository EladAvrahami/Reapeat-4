package addElemantToArrayProperty7;

public class Student {
    private String name;
    private String[] subjects;
    private  int numOfSubjects;

    public Student(String name,int maxSubjects){}

    public int getNumOfSubjects() {
        return numOfSubjects;
    }
  /*  public int getMaxSubjects(){
        return getMaxSubjects();
    }*/

    public boolean addSubject(String newSubject){
        if (numOfSubjects==subjects.length)//בדיקה שיש מקום להוסיף ירך נוסף
            return false;

        subjects[numOfSubjects]= newSubject;//הוספה למקום הפנוי הבא ועדכון מס האיברים התפוסים
        numOfSubjects++;
        return true;
    }

    public void show(){
        System.out.println(name+" learn "+numOfSubjects +" subjects:");
        for (int i=0;i<numOfSubjects;i++){
            System.out.println(subjects[i]);
        }
    }
}
