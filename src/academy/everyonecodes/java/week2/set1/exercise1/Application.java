package academy.everyonecodes.java.week2.set1.exercise1;

public class Application {
    public static void main(String[] args) {
        Student john = new Student("John", "Anna");
        Student sally = new Student("Sally", "Martin");

        sally.setClassmate("Lucian");
        System.out.println("Sally's new classmate name is: " + sally.getClassmate());
    }
}
