package academy.everyonecodes.java.week2.set1.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Dish soup = new Dish("Vegetable Soup", 5.90);
        Dish steak = new Dish("Steak", 11.90);
        Dish rice = new Dish("Rice", 6.90);
        List<Dish> dishList = List.of(soup, steak, rice);

        Menu menu = new Menu("Anatolia Restaurant", dishList);
        explain(menu);
    }

    public static void explain(Menu menu) {
        System.out.println("There are avaiable Dishes on the Menu: ");
        for (Dish dish : menu.getDishes()){
            System.out.println(dish.getName() + " for " + dish.getPrice());
        }
    }
}
