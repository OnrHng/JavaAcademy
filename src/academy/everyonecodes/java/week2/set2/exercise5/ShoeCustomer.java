package academy.everyonecodes.java.week2.set2.exercise5;

public class ShoeCustomer {
    private int size;

    public ShoeCustomer(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public boolean tryShoe(Shoe shoe) {
        return shoe.getSize() == size;
    }
}
