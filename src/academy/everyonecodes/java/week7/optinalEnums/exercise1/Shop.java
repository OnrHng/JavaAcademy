package academy.everyonecodes.java.week7.optinalEnums.exercise1;

import java.util.List;

public class Shop {
    private List<TShirt> availableShirts;

    public Shop() {
        TShirt t1 = new TShirt("Pink", Sizes.Size.XS, 10.90);
        TShirt t2 = new TShirt("Blue", Sizes.Size.XS, 10.90);
        TShirt t3 = new TShirt("White", Sizes.Size.S, 11.90);
        TShirt t4 = new TShirt("Yellow", Sizes.Size.M, 11.90);
        TShirt t5 = new TShirt("Red", Sizes.Size.M, 12.90);
        TShirt t6 = new TShirt("Black", Sizes.Size.M, 12.90);
        TShirt t7 = new TShirt("Purple", Sizes.Size.XL, 13.90);
        TShirt t8 = new TShirt("Orange", Sizes.Size.XL, 13.90);
        TShirt t9 = new TShirt("White", Sizes.Size.XXL, 14.90);
        TShirt t0 = new TShirt("Blue", Sizes.Size.XXL, 14.90);

        this.availableShirts = List.of(t0, t1, t2, t3, t4,t5, t6, t7, t8, t9);
    }

    public List<TShirt> getAvailableShirts() {
        return availableShirts;
    }
}
