package academy.everyonecodes.java.week6.exercise5;

import java.util.ArrayList;
import java.util.List;

public class LowCarbFinder {
    public List<Food> find(List<Food> foods) {

        List<Food> foodListHasLowerCarbs = new ArrayList<>();
        try {
            for (Food food : foods) {
                double nutritionsOfFood = food.getCarbs() + food.getFat() + food.getProtein();
                if (food.getCarbs() / nutritionsOfFood < 0.1 ) {
                    foodListHasLowerCarbs.add(food);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
        return foodListHasLowerCarbs;
    }
}
