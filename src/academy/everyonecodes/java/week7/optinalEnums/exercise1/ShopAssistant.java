package academy.everyonecodes.java.week7.optinalEnums.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    private Shop shop;

    public ShopAssistant() {
        this.shop = new Shop();
    }

    private Sizes.Size askForSize() {
        System.out.println("Welcome to everyone shops!\n" +
                            "What size do you have?");
        Scanner scanner =  new Scanner(System.in);
        String size = scanner.nextLine();

        return Sizes.Size.valueOf(size.toUpperCase());
    }

    private List<TShirt> findShirtsThatFit(Sizes.Size size) {

        List<TShirt> availableShirts = this.shop.getAvailableShirts();
        List<TShirt> fitTShirts = new ArrayList<>();
        for (TShirt tShirt : availableShirts) {
            if (tShirt.getSize().equals(size)) {
                fitTShirts.add(tShirt);
            }
        }
        return fitTShirts;
    }

    public void dealWithCustomer() {

        List<TShirt> availableShirts = findShirtsThatFit(askForSize());
        if (!availableShirts.isEmpty()) {
            for (TShirt tShirt : availableShirts){
                System.out.println("We have a " + tShirt.getColor() + " shirt for " + tShirt.getPrice() +" euro.");
            }
        } else {
            System.out.println("I'm sorry, we have no shirts available for your size.");
        }
    }
}
