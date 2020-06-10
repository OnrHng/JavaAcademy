package academy.everyonecodes.java.week4.set2.exercise5;

public class TipAdder {
    public static double addTip(double cost) {
        double costWithTip = cost * 1.05; // calculate cost with tip

        double diff = Math.ceil(costWithTip) - costWithTip; // calculate difference between cost and costWithTip

        if (diff > 0.5) {
            costWithTip = diff - 0.5 + costWithTip;
        } else {
            costWithTip += diff;
        }

        return costWithTip;
    }
}
