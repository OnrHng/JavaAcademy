package academy.everyonecodes.java.week2.reflection.exercise1;

public class CartApplication {
    public static void main(String[] args) {

        Product laptopHP = new Product("HP", 799.90);
        Product keyboardLogitec = new Product("Logitec", 49.90);

        keyboardLogitec.setPrice(39.90); // changing keyboard product price

        CartItem laptop = new CartItem(laptopHP, 1);
        CartItem keyboard = new CartItem(keyboardLogitec, 2);

        laptop.setAmountProduct(2); // changing amount of laptop item which is in the cart

    }
}
