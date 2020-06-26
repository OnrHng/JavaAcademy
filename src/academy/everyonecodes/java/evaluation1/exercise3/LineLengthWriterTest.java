package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthWriterTest {
    LineLengthWriter writer = new LineLengthWriter();

    @Test
    void write() {
        // read the strings.txt after then write lines line by line to stringLengths.txt file
        writer.write();

        // read stringLengths.txt file and add line into resultList
        Path path = Path.of("src/academy/everyonecodes/java/evaluation1/exercise3/stringLengths.txt");
        List<String> resultList = new ArrayList<>();
        try {
            resultList = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // compare expectedList and result list
        List<String> expectedList = List.of("4", "2", "3", "5", "10");
        assertEquals(expectedList, resultList);

    }

    @AfterEach
    void deleteFile() {
        try {
            // delete stringLengths.txt file after is tested
            Files.deleteIfExists(Path.of("src/academy/everyonecodes/java/evaluation1/exercise3/stringLengths.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}