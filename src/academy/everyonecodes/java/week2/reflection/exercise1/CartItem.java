package academy.everyonecodes.java.week2.reflection.exercise1;

public class CartItem {
    private Product product;
    private int amountProduct;

    public CartItem(Product product, int amountProduct) {
        this.product = product;
        this.amountProduct = amountProduct;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }
}
