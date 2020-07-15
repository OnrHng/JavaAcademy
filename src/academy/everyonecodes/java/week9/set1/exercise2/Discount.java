package academy.everyonecodes.java.week9.set1.exercise2;

import java.util.List;

public class Discount {

    private double discountPercentage;
    private List<String> applicableProductNames;

    public Discount(double discountPercentage, List<String> applicableProductNames) {
        this.discountPercentage = discountPercentage;
        this.applicableProductNames = applicableProductNames;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public List<String> getApplicableProductNames() {
        return applicableProductNames;
    }

    public double apply(Product product) {
        double  reduce = 0.0;

        if (getApplicableProductNames().contains(product.getName())){
            reduce = product.getPrice() * this.discountPercentage/100;
        }
        return reduce;
    }
}

