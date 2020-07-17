package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasolineCarTest {

    GasolineCar renault = new GasolineCar("Renault");
    GasolineCar vw = new GasolineCar("Volkswagen");

    @Test
    void describeBrandAndRefuel() {
        //brand
        assertEquals("I am a Renault car.", renault.describe());
        assertEquals("I am a Volkswagen car.", vw.describe());

        // refilling type
        assertEquals("I am refilling my gasoline tank!", renault.refuel());
        assertEquals("I am refilling my gasoline tank!", vw.refuel());

    }
}