package academy.everyonecodes.java.week2.set2.exercise5;

public class Application {
    public static void main(String[] args) {
        ShoeCustomer matildaShoe = new ShoeCustomer(38);
        ShoeCustomer hanselShoe = new ShoeCustomer(42);

        ShopAssistant shopAssistant = new ShopAssistant();
        System.out.println(" for matilda : ");
        shopAssistant.findShoeForCustomer(matildaShoe);
        System.out.println(" for Hansel : ");
        shopAssistant.findShoeForCustomer(hanselShoe);
    }
}
