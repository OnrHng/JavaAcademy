package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessDataParserTest {
    HappinessDataParser parser = new HappinessDataParser();

    @Test
    void parseLine() {
        Optional<HappinessRecord> resultRecord = parser.parseLine("3,Norway,7.554,1.488,1.582,1.028,0.603,0.271,0.341");
        HappinessRecord expectedRecord = new HappinessRecord("Norway", 3, 7.554);
        assertTrue(resultRecord.isPresent());
        assertEquals(expectedRecord, resultRecord.get());

        Optional<HappinessRecord> resultRecord2 = parser.parseLine("10,Austria,7.246,1.376,1.475,1.016,0.532,0.244,0.226");
        HappinessRecord expectedRecord2 = new HappinessRecord("Austria", 10, 7.246);
        assertTrue(resultRecord2.isPresent());
        assertEquals(expectedRecord2, resultRecord2.get());
    }

    @Test
    void parseLineWithEdgeCase() {
        Optional<HappinessRecord> resultRecord = parser.parseLine("=3123,!@!#!, abc,dads,1.573,!@#6,#!#!,xaj,xsxa");
        assertTrue(resultRecord.isEmpty());
    }
}