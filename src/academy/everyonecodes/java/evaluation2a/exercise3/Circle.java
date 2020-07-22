package academy.everyonecodes.java.evaluation2a.exercise3;

public class Circle implements Area {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        // A=πr2
        return Math.PI * radius * radius;
    }
}
