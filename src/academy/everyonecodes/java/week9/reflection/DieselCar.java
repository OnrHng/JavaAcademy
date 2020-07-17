package academy.everyonecodes.java.week9.reflection;

public class DieselCar extends Car {
    public DieselCar(String brand) {
        super(brand, "diesel");
    }

    @Override
    public String refuel() {
        return "I am refilling my " + this.getTypeEngine() + " tank!";
    }
}
