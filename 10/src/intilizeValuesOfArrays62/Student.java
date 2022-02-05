package intilizeValuesOfArrays62;


//המחלקה סטודנט שומרת שם של סטודנט ואת שמות מקצועות הקורסים שאליהם רשום
public class Student {
    private String name;
    private String[] subjects;
    private int numOfSubjects;//מס הקורסים שרשום בפועל

    public Student(String name,int maxSubjects){
        this.name=name;
        subjects=new String[maxSubjects];//יצירת מערך כגודל כמות המקצועות
        numOfSubjects=0;
    }

    public int getNumOfSubjects(){//מחזיר את מס הקורסים אליהם רשום סטודנט
        return numOfSubjects;
    }
    public int getMaxSubjects(){//מחזיר מס מקסימלי של קורס אליהם יכול להירשם
        return subjects.length;
    }
}
