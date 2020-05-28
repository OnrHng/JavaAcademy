package academy.everyonecodes.java.week2.set2.exercise5;

import java.util.List;

public class ShopAssistant {
    public void findShoeForCustomer(ShoeCustomer customer) {
        // Create available Shoes
        List<Shoe> availablesShoes;
        Shoe pink = new Shoe(39, "pink");
        Shoe red = new Shoe(40, "red");
        Shoe blue = new Shoe(38, "blue");
        Shoe black = new Shoe(41, "black");

        availablesShoes = List.of(pink, red, blue, black);

        boolean isShoeOk = false;
        int shoeIndex = -1; // for getting shoe index in the available shoes
        for (Shoe shoe : availablesShoes) { // check available shoe size for customer shoe size
            shoeIndex++;
            if (customer.tryShoe(shoe)) {
                isShoeOk = true;
                break; // if in the available shoe list has customer shoe's size return true and break loop.
            }
        }

        if (isShoeOk) {
            // get color using shoeIndex
            System.out.println("I will take the " + availablesShoes.get(shoeIndex).getColor() + " one!");
        } else {
            System.out.println("Nope, this one doesn’t fit, sorry!");
        }
    }
}
