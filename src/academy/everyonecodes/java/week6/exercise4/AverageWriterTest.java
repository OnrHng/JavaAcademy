package academy.everyonecodes.java.week6.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class AverageWriterTest {
    AverageWriter writer = new AverageWriter();

    @Test
    void write() {
        // input and output files's paths
        Path inputPath = Path.of("src/academy/everyonecodes/java/week6/data/numbers.txt");
        Path outputPath  = Path.of("src/academy/everyonecodes/java/week6/data/averages.txt");
        // run the write method to get avgList
        writer.write(inputPath, outputPath);
        // excepted file path
        Path expectedPath = Path.of("src/academy/everyonecodes/java/week6/data/averages_expected.txt");
        // test it
        try {
            Assertions.assertEquals(Files.readAllLines(expectedPath),Files.readAllLines(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    void deleteReverseLineFile(){
        // after the test method delete  output file
        try {
            Files.deleteIfExists(Path.of("src/academy/everyonecodes/java/week6/data/averages.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}