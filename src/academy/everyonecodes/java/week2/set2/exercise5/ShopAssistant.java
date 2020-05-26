package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer customer) {
        List<Shoe> avaiblesShoes;
        Shoe pink = new Shoe(39, "pink");
        Shoe red = new Shoe(40, "red");
        Shoe blue = new Shoe(38, "blue");
        Shoe black = new Shoe(42, "black");

        avaiblesShoes = List.of(pink, red, blue, black);

        for (Shoe shoe : avaiblesShoes) {
            if (customer.tryShoe(shoe)) {
                System.out.println("I will take the " + shoe.getColor() + " one!");
            }
            System.out.println("Nope, this one doesn’t fit, sorry!");
        }
    }
}
