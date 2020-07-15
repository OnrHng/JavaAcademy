package academy.everyonecodes.java.week9.set2.exercise1;

import academy.everyonecodes.java.week9.set2.exercise1.units.Units;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChangeUnitsCalculator {
    public List<MoneyUnit> calculate(double change) {
        //list of units of amount of change
        List<MoneyUnit> unitsChange = new ArrayList<>();

        // seperate double value into INteger and decimal parts
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(change));
        int intValue = bigDecimal.intValue(); // int value from change
        double decimalValue = Double.parseDouble(bigDecimal.subtract(new BigDecimal(intValue)).toPlainString());
        decimalValue = decimalValue * 100;

        // available money units
        List<MoneyUnit> availableUnits = Units.get();

        for (MoneyUnit unit : availableUnits) {
            if (unit.getCurrency().equals("Euro")){
                while (unit.getValue() <= intValue) {
                    intValue -= unit.getValue();
                    unitsChange.add(unit);
                }
            }else if (unit.getCurrency().equals("Cent")){
                while ((unit.getValue() <= decimalValue)) {
                    decimalValue -= unit.getValue();
                    unitsChange.add(unit);
                }
            }
        }

        return unitsChange;
    }

    public static void main(String[] args) {

        ChangeUnitsCalculator calculator = new ChangeUnitsCalculator();
        List<MoneyUnit> changeUnits = calculator.calculate(111.86);
        for (MoneyUnit unit : changeUnits) {
            System.out.println(unit.getCurrency() + unit.getValue());
        }
    }
}
