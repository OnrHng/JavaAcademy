package academy.everyonecodes.java.week7.set2.exercise4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalsContainSTest {

    Path pathInput = Path.of("src/academy/everyonecodes/java/week7/set2/exercise4/animals.txt");
    Path pathOutput = Path.of("src/academy/everyonecodes/java/week7/set2/exercise4/animals-s.txt");

    @Test
    void test() {
        FileLineAppender appender = new FileLineAppender();
        StreamFileReader streamFileReader = new StreamFileReader();

        Stream<String> lines = streamFileReader.readLines(pathInput);

        List<String> animalNamesWithS = lines.filter(name -> name.contains("s") || name.contains("S"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        for (String line : animalNamesWithS) {
            appender.append(pathOutput, line + "\n");
        }

        Assertions.assertFalse(animalNamesWithS.isEmpty());
    }

    @AfterEach
    void deleteOutputFile() {
        try {
            Files.deleteIfExists(pathOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
