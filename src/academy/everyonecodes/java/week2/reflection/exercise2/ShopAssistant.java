package academy.everyonecodes.java.week2.reflection.exercise2;

import academy.everyonecodes.java.week2.reflection.exercise1.Cart;
import academy.everyonecodes.java.week2.reflection.exercise1.CartItem;
import academy.everyonecodes.java.week2.reflection.exercise1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopAssistant {
    public Cart walkThroughShop(String name) {
        // creata all object which are need to use from exercise1 and above import them from ex1
        Product product;
        CartItem cartItem;
        Cart cart = null;
        List<CartItem> cartItemList = new ArrayList<>(); // create a List to add cart item

        System.out.println("Hello " + name + " , welcome to our shop!");

        boolean isShoppingContinue = true;
        while(isShoppingContinue) { // Loop will continue as long as the customer wants to shop.

            Scanner scan = new Scanner(System.in);
            System.out.println("What do you want to buy?");
            String productName = scan.nextLine();

            // as long as product name is not empty string or not nothing,
            // the required information will be requested from the customer and added to the shopping cart.
            if (!(productName.equals("") || productName.equals(" "))) {

                System.out.println("How much does it cost?");
                double productPrice = scan.nextDouble();
                System.out.println("How many do you want?");
                int amountOfProduct = scan.nextInt();

                product = new Product(productName, productPrice); // initialize product with name and price those given from user
                cartItem = new CartItem(product, amountOfProduct);// initialize cartItem with amount of Product
                cartItemList.add(cartItem);// add cart item into the List
                cart = new Cart(cartItemList, name); // initialize shopping cart for customer.

                System.out.println("Thank you, I will put that in the cart! Anything else!");

            } else {
                isShoppingContinue =false; // Loop will end when the customer says empty String or nothing
                System.out.println("Thanks " + name + " for shopping with us ;-)...");
                System.out.println(" -------------o---------------");
            }
        }

        return cart;
    }
}
