package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieselCarTest {

    DieselCar bmw = new DieselCar("BMW");
    DieselCar audi = new DieselCar("AUDI");

    @Test
    void describeBrandAndRefuel() {
        //brand
        assertEquals("I am a BMW car.", bmw.describe());
        assertEquals("I am a AUDI car.", audi.describe());

        // refilling type
        assertEquals("I am refilling my diesel tank!", bmw.refuel());
        assertEquals("I am refilling my diesel tank!", audi.refuel());

    }

}