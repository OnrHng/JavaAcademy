package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;

public class ShoppingApplication {
    public static void main(String[] args) {
        // create shop assistant and cashier
        ShopAssistant shopAssistant = new ShopAssistant();
        Cashier cashier = new Cashier();

        // create Carts for Derek and Hansel, initialize all values with shoppingAssistant object using walkThrough method
        Cart dereksCart = shopAssistant.walkThroughShop("Derek");
        Cart hanselCart = shopAssistant.walkThroughShop("Hansel");

        // calculate total price with cashier object using billCustomer method
        cashier.billCustomer(dereksCart);
        cashier.billCustomer(hanselCart);
    }
}
