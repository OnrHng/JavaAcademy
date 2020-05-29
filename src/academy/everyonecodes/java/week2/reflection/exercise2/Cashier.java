package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;

public class Cashier {
    public void billCustomer(Cart cart) {

        double totalPrice = 0.0;

        // if customer dont buy anything, then he should not to pay.
        if (cart == null || cart.getCartItemList().size() == 0) {
            System.out.println("Sorry dear Customer! You got nothing in our Shop. Therefore you don't have to pay...");
        }else {
            // calculating price of each product which is bought from customer  with amount of product
            for (CartItem cartItem : cart.getCartItemList()) {
                double cost = cartItem.getAmountProduct() * cartItem.getProduct().getPrice();
                totalPrice += cost; // sum all product price
            }
            // print the final cost with the customer name
            System.out.println(cart.getCartOwner() + " has to pay " + totalPrice + " Euros.");
        }
    }
}
