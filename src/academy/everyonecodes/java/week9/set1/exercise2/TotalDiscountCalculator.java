package academy.everyonecodes.java.week9.set1.exercise2;

import academy.everyonecodes.java.week9.set1.exercise2.discounts.Discounts;

import java.util.List;

public class TotalDiscountCalculator {

    public double calculate(List<Product> productList) {
        List<Discount> availableDiscounts = Discounts.getDiscounts();

        double total = 0.0;
        double reduce = 0.0;

        // calculate total
        for (Product product : productList){
            total += product.getPrice();

            for (Discount discount : availableDiscounts) {
                double currReduce = 0.0;

                if (discount.getApplicableProductNames().contains(product.getName())){
                    currReduce = discount.apply(product);
                }

                reduce += currReduce;

            }
        }

        return total - reduce;
    }

    public static void main(String[] args) {
        TotalDiscountCalculator calculator = new TotalDiscountCalculator();
        Product product1 = new Product("wine", 6.0);
        Product product2 = new Product("tomato", 3.0);
        Product product3 = new Product("bread", 2);
        Product product4 = new Product("cucumber", 3);
        Product product5 = new Product("ice", 4.5);

        List<Product> products = List.of(product1, product2, product3, product4, product5);

        System.out.println(calculator.calculate(products));
    }
}
