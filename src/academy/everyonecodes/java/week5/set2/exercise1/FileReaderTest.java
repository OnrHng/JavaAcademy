package academy.everyonecodes.java.week5.set2.exercise1;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {
    FileReader reader = new FileReader();

    @Test
    void read() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/document.txt");
        List<String> lines = reader.read(path);
        assertFalse(lines.isEmpty());
    }
    @Test
    void readEmptyFile() {
        Path path = Path.of("src/academy/everyonecodes/java/week5/set2/empty.txt");
        List<String> lines = reader.read(path);
        assertTrue(lines.isEmpty());
    }
}