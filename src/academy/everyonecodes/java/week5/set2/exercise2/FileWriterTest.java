package academy.everyonecodes.java.week5.set2.exercise2;

import academy.everyonecodes.java.week5.set2.exercise1.FileReader;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {
    FileWriter writer = new FileWriter();
    FileReader reader = new FileReader();

    Path filePath = Path.of("src/academy/everyonecodes/java/week5/set2/exercise2/outputFile.txt");
    Path filePath2 = Path.of("src/academy/everyonecodes/java/week5/set2/exercise2/outputFile2.txt");

    @Test
    void write() {
        List<String> dataList = List.of("EC", "FH Joanneum", "Graz");
        writer.write(filePath, dataList);

        List<String> resultList = reader.read(filePath);
        assertEquals(dataList, resultList); // write the List has elements into file

        List<String> emptyList = List.of();
        writer.write(filePath, emptyList); // write empty list to file

        List<String> resultEmptyList = reader.read(filePath);
        assertEquals(emptyList, resultEmptyList);
    }

    @Test
    void append() {
        List<String> dataList = List.of("EC", "FH Joanneum", "Graz");
        writer.append(filePath2, dataList);

        List<String> appendList = List.of("Austria", "Europa");
        writer.append(filePath2, appendList);

        List<String> expectedList = List.of("EC", "FH Joanneum", "Graz", "Austria", "Europa");
        List<String> resultList = reader.read(filePath2);
        assertEquals(expectedList, resultList);

    }
    @AfterEach
    void deleteFile() {
        try {
            Files.deleteIfExists(filePath);
            Files.deleteIfExists(filePath2); // delete output file 2
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}