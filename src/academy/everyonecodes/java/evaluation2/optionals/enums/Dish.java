package academy.everyonecodes.java.evaluation2.optionals.enums;

public class Dish {

    private String name;
    private Menu category;
    private double price;

    public Dish(String name, Menu category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Menu getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
