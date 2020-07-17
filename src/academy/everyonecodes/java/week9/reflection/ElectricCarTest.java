package academy.everyonecodes.java.week9.reflection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricCarTest {

    ElectricCar tesla = new ElectricCar("Tesla");
    ElectricCar nissan = new ElectricCar("Nissan");

    @Test
    void describeBrandAndRefuel() {
        //brand
        assertEquals("I am a Tesla car.", tesla.describe());
        assertEquals("I am a Nissan car.", nissan.describe());

        // refilling type
        assertEquals("I am recharging my electric car!", tesla.refuel());
        assertEquals("I am recharging my electric car!", nissan.refuel());

    }
}