package academy.everyonecodes.java.week9.set1.exercise2.discounts;

import academy.everyonecodes.java.week9.set1.exercise2.Discount;

import java.util.List;

public class Discounts {

    public static List<Discount> getDiscounts() {
        return List.of(new FiveOnWine(), new SevenOnSweets(), new TenOnVeggies());
    }
}
