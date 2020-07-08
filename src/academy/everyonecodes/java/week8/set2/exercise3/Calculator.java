package academy.everyonecodes.java.week8.set2.exercise3;

import academy.everyonecodes.java.week8.set2.exercise3.operators.*;

import java.util.List;

public class Calculator {
    private List<String> operators;

    public Calculator() {
        this.operators = Operators.get();
    }

    public String calculate(Calculation calculation) {
        Sum sum = new Sum();
        Subtraction subtraction = new Subtraction();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();

        if (operators.contains(calculation.getSymbol())) {
            if (calculation.getSymbol().equals(sum.getSymbol())){
                return String.valueOf(sum.operate(calculation.getNumber1(), calculation.getNumber2()));
            }else if (calculation.getSymbol().equals(subtraction.getSymbol())){
                return String.valueOf(subtraction.operate(calculation.getNumber1(), calculation.getNumber2()));
            }else if (calculation.getSymbol().equals(multiplication.getSymbol())){
                return String.valueOf(multiplication.operate(calculation.getNumber1(), calculation.getNumber2()));
            }else if (calculation.getSymbol().equals(division.getSymbol())){
                return String.valueOf(division.operate(calculation.getNumber1(), calculation.getNumber2()));
            }
        }
        return "Operation not available";
    }
}
