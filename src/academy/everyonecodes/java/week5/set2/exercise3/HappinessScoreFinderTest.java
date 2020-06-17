package academy.everyonecodes.java.week5.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class HappinessScoreFinderTest {
    HappinessScoreFinder finder = new HappinessScoreFinder();
    HappinessDataReader reader = new HappinessDataReader();

    @Test
    void findFor() {
        List<Optional<HappinessRecord>> recordList = reader.read();

        Optional<Double> resultHappinessScoreForAustria =  finder.findFor(recordList, "Austria");
        double expectedHappinessScoreForAustria = 7.246;
        assertTrue(resultHappinessScoreForAustria.isPresent());
        assertEquals(expectedHappinessScoreForAustria, resultHappinessScoreForAustria.get());

        Optional<Double> resultHappinessScoreForNorway =  finder.findFor(recordList, "Norway");
        double expectedHappinessScoreForNorway = 7.554;
        assertTrue(resultHappinessScoreForNorway.isPresent());
        assertEquals(expectedHappinessScoreForNorway, resultHappinessScoreForNorway.get());
    }

    @Test
    void findForWithEdgeCase() {
        HappinessRecord wrongRecord = new HappinessRecord("!@!#", 3213, -1321.012);
        List<Optional<HappinessRecord>> wrongRecordList = List.of(Optional.of(wrongRecord));

        Optional<Double> resultHappinessScoreForAustria =  finder.findFor(wrongRecordList, "Austria");

        assertTrue(resultHappinessScoreForAustria.isEmpty());


    }
}