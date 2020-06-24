package academy.everyonecodes.java.week6.exercise5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LowCarbFinderTest {
    LowCarbFinder finder = new LowCarbFinder();

    @Test
    void find() {
        // instance foods
        Food pizza = new Food("Vegetable Pizza", 31.2 , 10.1 , 10.9);
        Food steak = new Food("Steak", 1.3, 7.6, 26.0);
        Food tunaFish = new Food("Tuna", 0.1, 7.0, 25.2);
        Food chickenSoup = new Food("Chicken Soup", 10.0, 2.5, 4.3);
        Food avocado = new Food("Avocado", 6.0 , 18.1, 2.2);

        List<Food> foods = List.of(pizza, steak, tunaFish, chickenSoup, avocado );
        List<Food> lowerCarbsFoods = finder.find(foods);
        List<Food> expectedList = List.of(steak, tunaFish);

        assertEquals(expectedList, lowerCarbsFoods);
    }

    @Test
    void findFromEmptyList() {
        List<Food> emptyFoods = List.of();
        List<Food> expectedList = List.of();
        assertEquals(expectedList, finder.find(emptyFoods));
    }
}