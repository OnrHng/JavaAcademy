package academy.everyonecodes.java.week2.set2.exercise5;

public class Application {
    public static void main(String[] args) {
        ShoeCustomer matildaShoe = new ShoeCustomer(38); // for Matilda's shoe's size
        ShoeCustomer hanselShoe = new ShoeCustomer(42); // for Hansel's shoe's size

        ShopAssistant shopAssistant = new ShopAssistant(); // create new Shop Assistant

        System.out.println(" for matilda : ");
        shopAssistant.findShoeForCustomer(matildaShoe); // check available shoes with Matilda's shoe size(38)
        System.out.println(" for Hansel : ");
        shopAssistant.findShoeForCustomer(hanselShoe); // check available shoes with Hansel's shoe size(42)
    }
}
