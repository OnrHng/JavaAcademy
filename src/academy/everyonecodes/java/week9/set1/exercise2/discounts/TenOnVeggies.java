package academy.everyonecodes.java.week9.set1.exercise2.discounts;

import academy.everyonecodes.java.week9.set1.exercise2.Discount;

import java.util.List;

public class TenOnVeggies extends Discount {


    public TenOnVeggies() {
        super(10, List.of("tomato", "paprika", "cucumber"));
    }
}
