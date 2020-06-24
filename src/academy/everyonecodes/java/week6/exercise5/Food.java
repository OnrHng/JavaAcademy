package academy.everyonecodes.java.week6.exercise5;

public class Food {
    private String name;
    private double carbs;
    private double fat;
    private double protein;

    public Food(String name, double carbs, double fat, double protein) {
        this.name = name;
        this.carbs = carbs;
        this.fat = fat;
        this.protein = protein;
    }

    public String getName() {
        return name;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFat() {
        return fat;
    }

    public double getProtein() {
        return protein;
    }
}
