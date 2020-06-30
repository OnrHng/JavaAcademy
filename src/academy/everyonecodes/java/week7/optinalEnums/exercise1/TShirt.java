package academy.everyonecodes.java.week7.optinalEnums.exercise1;

public class TShirt {
    private String color;
    private Sizes.Size size;
    private double price;

    public TShirt(String color, Sizes.Size size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public Sizes.Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}
