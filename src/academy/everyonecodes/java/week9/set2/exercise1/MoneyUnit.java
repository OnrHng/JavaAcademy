package academy.everyonecodes.java.week9.set2.exercise1;

public class MoneyUnit {

    private int value;
    private String currency;

    public MoneyUnit(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public int getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }
}
