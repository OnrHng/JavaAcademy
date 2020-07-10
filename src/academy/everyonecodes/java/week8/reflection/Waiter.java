package academy.everyonecodes.java.week8.reflection;

import academy.everyonecodes.java.week8.reflection.cutlery.*;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private List<Cutlery> cutleries;

    public Waiter() {
        Spoon spoon = new Spoon();
        Fork fork = new Fork();
        Knife knife = new Knife();
        this.cutleries = List.of(spoon, fork, knife);
    }

    public List<Cutlery> getCutleries() {
        return cutleries;
    }

    public List<String> getCutlery(String dishName) {

        List<Cutlery> availableCutleries = getCutleries();
        List<String> namesNeedsCutleries = new ArrayList<>();
        dishName = dishName.toLowerCase();

        for (Cutlery cutlery : availableCutleries) {
            if (cutlery.isUsedFor(dishName)){
                namesNeedsCutleries.add(cutlery.getName());
            }
        }

        return namesNeedsCutleries;
    }
}
