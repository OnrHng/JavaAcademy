package academy.everyonecodes.java.evaluation2a.exercise4;

public class Freelancer extends Person {
    private double rate;
    private int hour;

    public Freelancer(String name, double rate, int hour) {
        super(name);
        this.rate = rate;
        this.hour = hour;
    }

    @Override
    public double getSalary() {
        return rate * hour;
    }
}
