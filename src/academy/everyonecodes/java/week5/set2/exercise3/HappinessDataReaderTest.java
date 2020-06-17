package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessDataReaderTest {

    HappinessDataReader reader = new HappinessDataReader();

    @Test
    void read() {
        HappinessRecord happinessRecord = new HappinessRecord("Finland", 1, 7.769);
        List<Optional<HappinessRecord>> resultRecordList = reader.read();
        assertTrue(resultRecordList.get(0).isPresent());
        assertEquals(happinessRecord, resultRecordList.get(0).get());

    }

    @Test
    void readWithEdgeCase() {
        HappinessRecord wrongRecord = new HappinessRecord("!@#!@#", -123323, 0.0);
        List<Optional<HappinessRecord>> resultRecordList = reader.read();
        assertTrue(resultRecordList.get(0).isPresent());
        assertNotEquals(wrongRecord, resultRecordList.get(0).get());

    }
}