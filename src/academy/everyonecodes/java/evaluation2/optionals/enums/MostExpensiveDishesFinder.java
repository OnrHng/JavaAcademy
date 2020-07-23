package academy.everyonecodes.java.evaluation2.optionals.enums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MostExpensiveDishesFinder {

    public List<Dish> find(List<Dish> dishes) {
        List<Dish> mostExpensiveDishes ;

        mostExpensiveDishes = dishes.stream().sorted(Comparator.comparing(Dish::getPrice).reversed()).limit(1).collect(Collectors.toList());

        return mostExpensiveDishes;
    }
}
