package academy.everyonecodes.java.week9.reflection;

public abstract class Car {
    private String brand;
    private String typeEngine;

    public Car(String brand, String typeEngine) {
        this.brand = brand;
        this.typeEngine = typeEngine;
    }

    public String getBrand() {
        return brand;
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public  String describe() {
        return "I am a " + getBrand() + " car.";
    }

    public abstract String refuel();

}
