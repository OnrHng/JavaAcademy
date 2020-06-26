package academy.everyonecodes.java.evaluation1.exercise2;

import java.util.List;

public class TotalCalculator {
    public double calculate(List<Product> productList) {
        // if the product list is empty, also return 0.0  . Therefore we don't need Optinals.empty
        double totalSum = 0.0;
        for (Product product : productList) {
            totalSum += product.getPrice();
        }
        return totalSum * 1.20; //  tax %20
    }
}
