package academy.everyonecodes.java.week2.set1.exercise3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> ingredients = List.of("eggs", "oil", "flour", "salt", "cheese", "spinach", "tometoSauce");
        List<String> steps = List.of("Make a Dough", "Prepare Sauce", "Load up on Toppings", "Put into Oven");

        Recipe pizza = new Recipe("Pizza", 40, ingredients, steps);

        // Just Testing for ingredients to print on the console
        System.out.println("Pizza Ingredients are: ");
        for (Object ingredient : pizza.getIngredients()) {
            System.out.println(ingredient);
        }
    }
}
