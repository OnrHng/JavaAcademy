package academy.everyonecodes.java.week2.set1.exercise1;

public class Student {
    private String name;
    private String classmate;

    public Student(String name , String classmate){
        this.name = name;
        this.classmate = classmate;
    }

    public void setClassmate(String classmate) {
        this.classmate = classmate;
    }

    public String getName() {
        return name;
    }

    public String getClassmate() {
        return classmate;
    }
}
