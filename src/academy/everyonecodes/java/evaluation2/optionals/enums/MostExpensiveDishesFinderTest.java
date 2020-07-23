package academy.everyonecodes.java.evaluation2.optionals.enums;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MostExpensiveDishesFinderTest {

    MostExpensiveDishesFinder finder = new MostExpensiveDishesFinder();
    @Test
    void find() {
        Dish starter1 = new Dish("Suppe", Menu.STARTER, 5.5);
        Dish starter2 = new Dish("Egg with Bread", Menu.STARTER, 4.5);

        Dish mainDish1 = new Dish("Steak", Menu.MAINDISH, 12.5);
        Dish mainDish2 = new Dish("Salat", Menu.MAINDISH, 6.5);

        Dish dessert1 = new Dish("Ice", Menu.DESSERT, 3.5);
        Dish dessert2 = new Dish("Puding", Menu.DESSERT, 5.5);

        List<Dish> dishes = List.of(starter1,starter2, mainDish1, mainDish2, dessert1, dessert2);
        List<Dish> expected = List.of(mainDish1);

        assertEquals(expected.get(0).getName(), finder.find(dishes).get(0).getName());

        // just my method find most expensive dish and the name of it assert with expected list element's name
    }
}