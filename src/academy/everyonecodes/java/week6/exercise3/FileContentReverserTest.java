package academy.everyonecodes.java.week6.exercise3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileContentReverserTest {
    FileContentReverser reverser = new FileContentReverser();
    @Test
    void reverse() {
        // input and output files's paths
        Path inputPath = Path.of("src/academy/everyonecodes/java/week6/data/lines.txt");
        Path outputPath  = Path.of("src/academy/everyonecodes/java/week6/data/lines-reversed.txt");
        // run the reverser method
        reverser.reverse(inputPath, outputPath);
        // excepted file path
        Path expectedInputPath = Path.of("src/academy/everyonecodes/java/week6/data/lines-reversed_expected.txt");
        // test it
        try {
            Assertions.assertEquals(Files.readAllLines(expectedInputPath),Files.readAllLines(outputPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @AfterEach
    void deleteReverseLineFile(){
        // after the test method delete  output file
        try {
            Files.deleteIfExists(Path.of("src/academy/everyonecodes/java/week6/data/lines-reversed.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}