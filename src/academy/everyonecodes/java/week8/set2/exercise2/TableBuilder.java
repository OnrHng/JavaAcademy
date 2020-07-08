package academy.everyonecodes.java.week8.set2.exercise2;

import java.util.List;

public class TableBuilder {
    private List<BuildingStep> steps ;

    public TableBuilder() {
        this.steps = List.of(new AddSurface(),new AddLeg(), new AddLeg(), new AddLeg(), new AddLeg());
    }

    public Furniture build() {
        Furniture table = new Furniture("Table");

        for (BuildingStep step : steps) {
            step.apply(table);
        }

        return table;
    }
}
