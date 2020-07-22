package academy.everyonecodes.java.evaluation2a.exercise4;

public class PermanentEmployee extends Person {
    private double salary;

    public PermanentEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }


}
