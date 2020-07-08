package academy.everyonecodes.java.week8.set2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableBuilderTest {
    TableBuilder tableBuilder = new TableBuilder();

    @Test
    void build() {
        Furniture resultFurniture = tableBuilder.build();

        Furniture expectedFurniture = new Furniture("Table");
        expectedFurniture.getParts().add("surface");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");
        expectedFurniture.getParts().add("leg");

        assertEquals(expectedFurniture.getName(), resultFurniture.getName());
        assertEquals(expectedFurniture.getParts(), resultFurniture.getParts());

    }
}