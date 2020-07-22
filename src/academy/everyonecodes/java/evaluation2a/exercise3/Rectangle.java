package academy.everyonecodes.java.evaluation2a.exercise3;

public class Rectangle implements Area {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        // A=wl
        return width * length;
    }
}
